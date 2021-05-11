package com.sml.kafkaproducer.config;

import com.sml.kafkaproducer.config.serializer.AvroSerializer;
import lombok.RequiredArgsConstructor;
import nlmk.l3.ccm.pgp.AttestationRequest;
import nlmk.l3.sup.IntegralParameters;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class CcmProduserKafkaConfig {

    private final ProducerKafkaProperties producerKafkaProperties;

    @Bean
    public ProducerFactory<String, AttestationRequest> producerFactoryReq() {
        Map<String, Object> propsIP = new HashMap<>();
        propsIP.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, producerKafkaProperties.getKafkaServer());
        propsIP.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        propsIP.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, AvroSerializer.class);
        propsIP.put(ProducerConfig.CLIENT_ID_CONFIG,
                "ccm");

        DefaultKafkaProducerFactory factory =
                new DefaultKafkaProducerFactory<>(propsIP);

        return factory;
    }

    @Bean
    public KafkaTemplate<String, AttestationRequest> kafkaTemplateReq() {
        KafkaTemplate<String, AttestationRequest> template =
                new KafkaTemplate<>(producerFactoryReq());

        return template;
    }

    @Bean
    public NewTopic topicReq() {
        return new NewTopic(producerKafkaProperties.getKafkaTopicReq(), 1, (short) 1);
    }

}
