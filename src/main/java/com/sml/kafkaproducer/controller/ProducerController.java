package com.sml.kafkaproducer.controller;

import com.sml.kafkaproducer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Random;

import integralparameters.nlmk.l3.sup.IntegralParameters;
import unrecoverableparameterstrends.nlmk.l3.sup.UnrecoverableParametersTrends;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @GetMapping("/integral_parameters/{correct}")
    public void sendIP(@PathVariable boolean correct) {

      producerService.produceMessageIP("Hello Kafka SSL");
    }

    private IntegralParameters generateIP(boolean correct){

        int idRecordPK=0;

        if (correct) idRecordPK = new Random().nextInt(100);

        IntegralParameters integralParameters = IntegralParameters.newBuilder()
                .setTs(LocalDateTime.now().toString())
                .setOp(integralparameters.nlmk.l3.sup.enum_op.I)
                .setPk(
                        integralparameters.nlmk.l3.sup.RecordPk.newBuilder()
                                .setId(idRecordPK)
                                .build()
                )
                .setData(null)
                .build();

        return integralParameters;
    }
//
//    @GetMapping("/unrecoverable_parameters")
//    public void sendUP() {
//
//        UnrecoverableParametersTrends unrecoverableParameters = UnrecoverableParametersTrends.newBuilder()
//                .setTs(LocalDateTime.now().toString())
//                .setOp(unrecoverableparameterstrends.nlmk.l3.sup.enum_op.I)
//                .setPk(
//                        unrecoverableparameterstrends.nlmk.l3.sup.RecordPk.newBuilder()
//                                .setId(new Random().nextInt(100))
//                                .build()
//                )
//                .setData(null)
//                .build();
//
//        producerService.produceMessageUP(unrecoverableParameters);
//    }
}
