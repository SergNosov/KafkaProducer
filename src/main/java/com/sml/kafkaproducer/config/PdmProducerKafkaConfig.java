package com.sml.kafkaproducer.config;

import com.sml.kafkaproducer.config.serializer.AvroSerializer;
import nlmk.l3.pdm.SpMicrostructure;
import nlmk.l3.pdm.SpTkNum;
import nlmk.l3.pdm.SpTolLength;
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
    public ProducerFactory<String, SpMicrostructure> producerFactoryPdmMicro() {
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
    public ProducerFactory<String, SpTolLength> producerFactoryPdmLength() {
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
    public ProducerFactory<String, SpTkNum> producerFactoryPdmTkNum() {
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
    public KafkaTemplate<String, SpTkNum> kafkaTemplatePdmTkNum() {
        KafkaTemplate<String, SpTkNum> template =
                new KafkaTemplate<>(producerFactoryPdmTkNum());

        return template;
    }

    @Bean
    public KafkaTemplate<String, SpMicrostructure> kafkaTemplatePdmMicro() {
        KafkaTemplate<String, SpMicrostructure> template =
                new KafkaTemplate<>(producerFactoryPdmMicro());

        return template;
    }

    @Bean
    public KafkaTemplate<String, SpTolLength> kafkaTemplatePdmLength() {
        KafkaTemplate<String, SpTolLength> template =
                new KafkaTemplate<>(producerFactoryPdmLength());

        return template;
    }

    @Bean
    public NewTopic topicMicro() {
        return new NewTopic("000-1.l3-pdm.cdc.sp-microstructure.0", 1, (short) 1);
    }

    @Bean
    public NewTopic topicLength() {
        return new NewTopic("000-1.l3-pdm.cdc.sp-tol-length.0", 1, (short) 1);
    }

    @Bean
    public NewTopic topicTkNum() {
        return new NewTopic("000-1.l3-pdm.cdc.sp-tk-num.0", 1, (short) 1);
    }

}
