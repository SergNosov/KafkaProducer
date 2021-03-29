package com.sml.kafkaproducer.controller;

import com.sml.kafkaproducer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import nlmk.l3.sup.RecordPk;
import nlmk.l3.sup.enum_op;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Random;

import nlmk.l3.sup.IntegralParameters;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @GetMapping("/integral_parameters")
    public void sendIP() {

        IntegralParameters integralParameters = IntegralParameters.newBuilder()
                .setTs(LocalDateTime.now().toString())
                .setOp(enum_op.I)
                .setPk(
                      RecordPk.newBuilder()
                              .setId(new Random().nextInt(3))
                              .build()
                )
                .setData(null)
                .build();

      producerService.produceMessage(integralParameters);
    }
}
