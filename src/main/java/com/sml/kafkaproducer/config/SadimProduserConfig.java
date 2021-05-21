package com.sml.kafkaproducer.config;

import com.sml.kafkaproducer.config.serializer.AvroSerializer;
import lombok.extern.slf4j.Slf4j;
import nlmk.l3.ccm.pgp.AttestationRequest;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import unrecoverableparameterstrends.nlmk.l3.sup.UnrecoverableParametersTrends;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Configuration
public class SadimProduserConfig {

    @Bean
    public ProducerFactory<String, String> producerFactorySadim() {
        Map<String, Object> propsIP = new HashMap<>();
        propsIP.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        propsIP.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        propsIP.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        propsIP.put(ProducerConfig.CLIENT_ID_CONFIG, "sadim");

        DefaultKafkaProducerFactory factory =
                new DefaultKafkaProducerFactory<>(propsIP);

        return factory;
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplateSadim() {
        KafkaTemplate<String, String> template =
                new KafkaTemplate<>(producerFactorySadim());

        return template;
    }

    @Bean
    public NewTopic topicSadim() {
        return new NewTopic("PA-MU.NLMK.P3.HSM", 1, (short) 1);
    }
}
