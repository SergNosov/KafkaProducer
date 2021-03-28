package com.sml.kafkaproducer.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties("kafka")
public class ProducerKafkaProperties {
    private final String kafkaServer;
    private final String kafkaProducerId;
    private final String kafkaTopic;

    public ProducerKafkaProperties(@Value("${kafka.bootstrap-servers}") String kafkaServer,
                                   @Value("${kafka.producer.id}") String kafkaProducerId,
                                   @Value("${kafka.topic}") String kafkaTopic) {
        this.kafkaServer = kafkaServer;
        this.kafkaProducerId = kafkaProducerId;
        this.kafkaTopic = kafkaTopic;
    }
}
