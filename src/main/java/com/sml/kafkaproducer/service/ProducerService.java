package com.sml.kafkaproducer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nlmk.l3.ccm.pgp.AttestationRequest;
import nlmk.l3.sup.IntegralParameters;
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

    private final KafkaTemplate<String, IntegralParameters> kafkaTemplateIP;
    private final KafkaTemplate<String, UnrecoverableParametersTrends> kafkaTemplateUP;
    private final KafkaTemplate<String, AttestationRequest> kafkaTemplateReq;

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
}
