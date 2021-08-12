package com.sml.kafkaproducer.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties("kafka")
public class ProducerKafkaProperties {
    private final String kafkaServer;
    private final String kafkaProducerId;
    private final String kafkaTopicIP;
    private final String kafkaTopicUP;
    private final String kafkaTopicReq;

    public ProducerKafkaProperties(@Value("${kafka.bootstrap-servers}") String kafkaServer,
                                   @Value("${kafka.producer.id}") String kafkaProducerId,
                                   @Value("${kafka.topicIP}") String kafkaTopicIP,
                                   @Value("${kafka.topicUP}") String kafkaTopicUP,
                                   @Value("${kafka.topicReq}") String kafkaTopicReq) {
        this.kafkaServer = kafkaServer;
        this.kafkaProducerId = kafkaProducerId;
        this.kafkaTopicIP = kafkaTopicIP;
        this.kafkaTopicUP = kafkaTopicUP;
        this.kafkaTopicReq = kafkaTopicReq;
    }
}
