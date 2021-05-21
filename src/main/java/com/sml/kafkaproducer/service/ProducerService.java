package com.sml.kafkaproducer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import nlmk.l3.ccm.pgp.AttestationRequest;
import nlmk.l3.pdm.SpMicrostructure;
import nlmk.l3.sup.IntegralParameters;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import unrecoverableparameterstrends.nlmk.l3.sup.UnrecoverableParametersTrends;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProducerService {

    @Value(value = "${kafka.topicIP}")
    private String topicIP;

    @Value(value = "${kafka.topicUP}")
    private String topicUP;

    @Value(value = "${kafka.topicReq}")
    private String topicReq;

    private final String topicMicrostructure = "000-1.l3-pdm.cdc.sp-microstructure.0";

    private final String topicSadim = "PA-MU.NLMK.P3.HSM";

    private final KafkaTemplate<String, IntegralParameters> kafkaTemplateIP;
    private final KafkaTemplate<String, UnrecoverableParametersTrends> kafkaTemplateUP;
    private final KafkaTemplate<String, AttestationRequest> kafkaTemplateReq;
    private final KafkaTemplate<String,SpMicrostructure> kafkaTemplatePdm;
    private final KafkaTemplate<String,String > kafkaTemplateSadim;

    public void produceMessageIP(IntegralParameters integralParameters) {
        Message<IntegralParameters> message = MessageBuilder
                .withPayload(integralParameters)
                .setHeader(KafkaHeaders.MESSAGE_KEY,Integer.valueOf(integralParameters.getPk().getId()).toString())
                .setHeader(KafkaHeaders.TOPIC,topicIP)
                .build();
        kafkaTemplateIP.send(message);
        log.info("--- sending message: "+message);
       // log.info("--- sending message IntegralParameters: " + message.toString());
    }

    public void produceMessageUP(UnrecoverableParametersTrends unrecoverableParameters) {
        Message<UnrecoverableParametersTrends> message = MessageBuilder
                .withPayload(unrecoverableParameters)
                .setHeader(KafkaHeaders.MESSAGE_KEY, Integer.valueOf(unrecoverableParameters.getPk().getId()).toString())
                .setHeader(KafkaHeaders.TOPIC, topicUP)
                .build();

        kafkaTemplateUP.send(message);
        log.info("--- sending message UnrecoverableParametersTrends: " + message);
    }

    public void produceMessageReq(AttestationRequest value){
        Message<AttestationRequest> message = MessageBuilder
                .withPayload(value)
                .setHeader(KafkaHeaders.TOPIC, topicReq)
                .build();

        kafkaTemplateReq.send(message);
        log.info("--- sending message value: {}; OP: {}", value.getPk(), value.getOp());
       // log.info("--- sending message value: " + message);
    }

    public void produceMessagePdmMicrostructure(SpMicrostructure micro){
        val key = StringUtils.join(micro.getPk().getSystemCode(),
                "~",micro.getPk().getDirectoryId(),"~",micro.getPk().getId());

        Message<SpMicrostructure> message = MessageBuilder
                .withPayload(micro)
                .setHeader(KafkaHeaders.TOPIC, topicMicrostructure)
                .setHeader(KafkaHeaders.MESSAGE_KEY, key)
                .build();
        kafkaTemplatePdm.send(message);
        log.info("--- sending message micro: {}; OP: {}", micro.getPk(), micro.getOp());
    }

    public void produceSadimMessage(String jsonString){

        Message<String> message = MessageBuilder
                .withPayload(jsonString)
                .setHeader(KafkaHeaders.TOPIC, topicMicrostructure)
                .build();
        kafkaTemplateSadim.send(message);

        log.info("--- sending message sadim.");
     }
}
