package com.sml.kafkaproducer.config;

import com.sml.kafkaproducer.config.serializer.AvroSerializer;
import lombok.RequiredArgsConstructor;
import integralparameters.nlmk.l3.sup.IntegralParameters;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import unrecoverableparameterstrends.nlmk.l3.sup.UnrecoverableParametersTrends;

import java.util.HashMap;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class KafkaProducerConfig {

    private final ProducerKafkaProperties producerKafkaProperties;

    @Bean
    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();

        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, producerKafkaProperties.getKafkaServer());
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, AvroSerializer.class);
        props.put(ProducerConfig.CLIENT_ID_CONFIG, producerKafkaProperties.getKafkaProducerId());

        return props;
    }

    @Bean
    public ProducerFactory<String, IntegralParameters> producerFactoryIP() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, IntegralParameters> kafkaTemplateIP() {
        KafkaTemplate<String, IntegralParameters> template =
                new KafkaTemplate<>(producerFactoryIP());

        return template;
    }

    @Bean
    public ProducerFactory<String, UnrecoverableParametersTrends> producerFactoryUP() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, UnrecoverableParametersTrends> kafkaTemplateUP() {
        KafkaTemplate<String, UnrecoverableParametersTrends> template =
                new KafkaTemplate<>(producerFactoryUP());

        return template;
    }

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();

        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG,
                producerKafkaProperties.getKafkaServer());

        return new KafkaAdmin(configs);
    }

    @Bean
    public NewTopic topicIP() {
        return new NewTopic(producerKafkaProperties.getKafkaTopicIP(), 1, (short) 1);
    }

    @Bean
    public NewTopic topicUP() {
        return new NewTopic(producerKafkaProperties.getKafkaTopicUP(), 1, (short) 1);
    }
}
