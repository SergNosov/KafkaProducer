package com.sml.kafkaproducer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import integralparameters.nlmk.l3.sup.IntegralParameters;
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

    private final KafkaTemplate<String, String> kafkaTemplateIP;

    public void produceMessageIP(String integralParameters) {
        Message<String> message = MessageBuilder
                .withPayload(integralParameters)
                .build();
        kafkaTemplateIP.send(message);
        log.info("--- sending message: "+message);
    }
}
