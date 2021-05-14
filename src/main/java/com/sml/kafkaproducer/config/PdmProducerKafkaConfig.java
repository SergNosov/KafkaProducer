package com.sml.kafkaproducer.config;

import com.sml.kafkaproducer.config.serializer.AvroSerializer;
import nlmk.l3.ccm.pgp.AttestationRequest;
import nlmk.l3.pdm.SpMicrostructure;
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
public class PdmProducerKafkaConfig {

    @Bean
    public ProducerFactory<String, SpMicrostructure> producerFactoryPdm() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, AvroSerializer.class);
        props.put(ProducerConfig.CLIENT_ID_CONFIG,"pdm");

        DefaultKafkaProducerFactory factory =
                new DefaultKafkaProducerFactory<>(props);

        return factory;
    }

    @Bean
    public KafkaTemplate<String, SpMicrostructure> kafkaTemplatePdm() {
        KafkaTemplate<String, SpMicrostructure> template =
                new KafkaTemplate<>(producerFactoryPdm());

        return template;
    }

    @Bean
    public NewTopic topicMicro() {
        return new NewTopic("000-1.l3-pdm.cdc.sp-microstructure.0", 1, (short) 1);
    }

}
