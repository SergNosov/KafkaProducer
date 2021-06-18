package com.sml.kafkaproducer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import nlmk.l3.ccm.pgp.AttestationRequest;
import nlmk.l3.pdm.SpMicrostructure;
import nlmk.l3.pdm.SpTkNum;
import nlmk.l3.pdm.SpTolLength;
import nlmk.l3.sup.IntegralParameters;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import unrecoverableparameterstrends.nlmk.l3.sup.UnrecoverableParametersTrends;

import java.util.UUID;

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
    private final String topicLength = "000-1.l3-pdm.cdc.sp-tol-length.0";
    private final String topicTkNum = "000-1.l3-pdm.cdc.sp-tk-num.0";

    private final KafkaTemplate<String, IntegralParameters> kafkaTemplateIP;
    private final KafkaTemplate<String, UnrecoverableParametersTrends> kafkaTemplateUP;
    private final KafkaTemplate<String, AttestationRequest> kafkaTemplateReq;
    private final KafkaTemplate<String, SpMicrostructure> kafkaTemplatePdmMicro;
    private final KafkaTemplate<String, SpTolLength> kafkaTemplatePdmLength;
    private final KafkaTemplate<String, String> kafkaTemplateSadim;
    private final KafkaTemplate<String, SpTkNum> kafkaTemplateTkNum;

    public void produceMessageIP(IntegralParameters integralParameters) {
        Message<IntegralParameters> message = MessageBuilder
                .withPayload(integralParameters)
                .setHeader(KafkaHeaders.MESSAGE_KEY, Integer.valueOf(integralParameters.getPk().getId()).toString())
                .setHeader(KafkaHeaders.TOPIC, topicIP)
                .build();
        kafkaTemplateIP.send(message);
        log.info("--- sending message: " + message);
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

    public void produceMessageReq(AttestationRequest value) {
        Message<AttestationRequest> message = MessageBuilder
                .withPayload(value)
                .setHeader(KafkaHeaders.TOPIC, topicReq)
                .setHeader(KafkaHeaders.MESSAGE_KEY, "fakeMK")
                .setHeader(KafkaHeaders.PARTITION_ID, 0)
                .build();

        kafkaTemplateReq.send(message);
        log.info("--- sending message value: {}; OP: {}; data.length: {}",
                value.getPk(), value.getOp(), value.getData().getLength());
        // log.info("--- sending message value: " + message);
    }

    public void produceMessagePdmMicrostructure(SpMicrostructure micro, boolean isError) {

        String key = UUID.randomUUID().toString();

        if (isError == true) {
            key = "111";
        }

        micro.getPk().setId(key);

        Message<SpMicrostructure> message = MessageBuilder
                .withPayload(micro)
                .setHeader(KafkaHeaders.TOPIC, topicMicrostructure)
                .setHeader(KafkaHeaders.MESSAGE_KEY, key)
                .build();
        kafkaTemplatePdmMicro.send(message);
        log.info("--- sending message micro: {}; OP: {}", micro.getPk(), micro.getOp());
    }

    public void produceSadimMessage(String jsonString) {

        Message<String> message = MessageBuilder
                .withPayload(jsonString)
                .setHeader(KafkaHeaders.TOPIC, topicSadim)
                .setHeader(KafkaHeaders.MESSAGE_KEY, "fakeKey~1234~Qwerty")
                .build();
        kafkaTemplateSadim.send(message);

        log.info("--- sending message sadim.");
    }

    public void produceMessagePdmLength(SpTolLength length) {
        val key = StringUtils.join(length.getPk().getSystemCode(),
                "~", length.getPk().getDirectoryId(), "~", length.getPk().getId());

        Message<SpTolLength> message = MessageBuilder
                .withPayload(length)
                .setHeader(KafkaHeaders.TOPIC, topicLength)
                .setHeader(KafkaHeaders.MESSAGE_KEY, key)
                .build();
        kafkaTemplatePdmLength.send(message);
        log.info("--- message: " + message);
        log.info("--- sending message length: {}; OP: {}", length.getPk(), length.getOp());
    }

    public void produceMessagePdmTkNum(SpTkNum tkNum) {
        val key = StringUtils.join(tkNum.getPk().getSystemCode(),
                "~", tkNum.getPk().getDirectoryId(), "~", tkNum.getPk().getId());

        Message<SpTkNum> message = MessageBuilder
                .withPayload(tkNum)
                .setHeader(KafkaHeaders.TOPIC, topicTkNum)
                .setHeader(KafkaHeaders.MESSAGE_KEY, key)
                .build();
        kafkaTemplateTkNum.send(message);
        log.info("--- message: " + message);
        log.info("--- sending message tkNum: {}", tkNum);
    }
}
