package com.sml.kafkaproducer.service;

import com.sml.kafkaproducer.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
    private final KafkaTemplate<String, User> kafkaTemplate;

    public void produceMessage(User user) {
        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.MESSAGE_KEY,user.getId())
                .setHeader(KafkaHeaders.TOPIC,topicName)
                .build();

        kafkaTemplate.send(message);
        log.info("--- sending message: " + message.toString());
    }
}
