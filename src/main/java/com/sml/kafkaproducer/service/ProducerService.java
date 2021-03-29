package com.sml.kafkaproducer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nlmk.l3.sup.IntegralParameters;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProducerService {

    @Value(value = "${kafka.topic}")
    private String topicName;
    private final KafkaTemplate<String, IntegralParameters> kafkaTemplate;

    public void produceMessage(IntegralParameters integralParameters) {
        Message<IntegralParameters> message = MessageBuilder
                .withPayload(integralParameters)
                .setHeader(KafkaHeaders.MESSAGE_KEY,Integer.valueOf(integralParameters.getPk().getId()).toString())
                .setHeader(KafkaHeaders.TOPIC,topicName)
                .build();

        kafkaTemplate.send(message);
        log.info("--- sending message: " + message.toString());
    }
}
