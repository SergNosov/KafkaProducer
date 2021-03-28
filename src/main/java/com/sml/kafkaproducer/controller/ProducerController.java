package com.sml.kafkaproducer.controller;

import com.sml.kafkaproducer.model.User;
import com.sml.kafkaproducer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @GetMapping("/send")
    public void sendMessage() {

        User user = User.builder()
                .id(UUID.randomUUID().toString())
                .name(RandomStringUtils.randomAlphabetic(10))
                .age(35)
                .build();

        producerService.produceMessage(user);
    }
}
