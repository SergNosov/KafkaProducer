package com.sml.kafkaproducer.config;

import com.sml.kafkaproducer.config.serializer.AvroSerializer;
import lombok.RequiredArgsConstructor;
import nlmk.l3.sup.IntegralParameters;
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

    /**
     * При создании двух и более producer при установки в единый producerConfigs()     *
     * возникает ошибка: javax.management.InstanceAlreadyExistsException: kafka.producer:type=
     * причина: разные потоки обращаются к одному бину....
     * ????? это не выход -  для предотвращения ошибки следует не устанавливать значения в общем producerConfigs();
     */

    @Bean
    public ProducerFactory<String, IntegralParameters> producerFactoryIP() {
        Map<String, Object> propsIP = new HashMap<>();
        propsIP.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, producerKafkaProperties.getKafkaServer());
        propsIP.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        propsIP.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, AvroSerializer.class);
        propsIP.put(ProducerConfig.CLIENT_ID_CONFIG,
                producerKafkaProperties.getKafkaProducerId());

        DefaultKafkaProducerFactory factory =
                new DefaultKafkaProducerFactory<>(propsIP);

        return factory;
    }

    @Bean
    public KafkaTemplate<String, IntegralParameters> kafkaTemplateIP() {
        KafkaTemplate<String, IntegralParameters> template =
                new KafkaTemplate<>(producerFactoryIP());

        return template;
    }

    @Bean
    public ProducerFactory<String, UnrecoverableParametersTrends> producerFactoryUP() {
        Map<String, Object> propsUP = new HashMap<>();
        propsUP.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, producerKafkaProperties.getKafkaServer());
        propsUP.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        propsUP.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, AvroSerializer.class);
        propsUP.put(ProducerConfig.CLIENT_ID_CONFIG, "producer - 888");

        return new DefaultKafkaProducerFactory<>(propsUP);
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
