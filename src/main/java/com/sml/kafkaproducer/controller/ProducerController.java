package com.sml.kafkaproducer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
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

      producerService.produceMessageIP(generateFromJson());
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

    private IntegralParameters generateFromJson() {
        IntegralParameters  ip = generateIP(true);

        try {
            String json = "{\"ts\": \"2021-04-16T08:17:28.811-03:00\", \"op\": \"U\", \"pk\": {\"id\": 144954755}, \"data\": {\"primeID\": \"0001020210416033915922670\", \"kceh\": 12, \"kcehName\": \"ЦГП\", \"unitCode\": 37, \"unitName\": \"Стан 2000 (П3)\", \"werksCode\": 1011, \"werksName\": \"NLMK\", \"specifications\": [{\"specCode\": 11, \"specName\": \"Уставка на Ткп (min)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 835.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 12, \"specName\": \"Уставка на Ткп (max)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 875.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 9, \"specName\": \"Уставка на Тсм (min)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 650.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 10, \"specName\": \"Уставка на Тсм (max)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 690.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 18, \"specName\": \"Процент длины полосы, на которой ширина в допуске (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 98.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 13, \"specName\": \"Величина среднего профиля (выпуклости) полосы (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 36.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 14, \"specName\": \"Величина средней клиновидности полосы (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": -6.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 20, \"specName\": \"СККП: Наибольшая критичность дефекта на полосе\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 2.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 17, \"specName\": \"Процент длины полосы, на которой толщина входит в полный допуск (СГП) (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 100.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 15, \"specName\": \"Процент длины полосы, на которой толщина входит в (1/2) допуска (СГП) (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 97.12, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 16, \"specName\": \"Процент длины полосы, на которой толщина входит в (2/3) допуска (СГП) (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 99.37, \"specFormat\": null, \"specMeasure\": null}]}}\n";
            ip = new ObjectMapper().registerModule(new JavaTimeModule())
                    .readValue(json, IntegralParameters.class);
        } catch (JsonProcessingException jpe) {
            System.err.println("--- jpe: "+jpe.getMessage());
            ip = generateIP(true);
        }

        return ip;
    }

    @GetMapping("/unrecoverable_parameters")
    public void sendUP() {

        UnrecoverableParametersTrends unrecoverableParameters = UnrecoverableParametersTrends.newBuilder()
                .setTs(LocalDateTime.now().toString())
                .setOp(unrecoverableparameterstrends.nlmk.l3.sup.enum_op.I)
                .setPk(
                        unrecoverableparameterstrends.nlmk.l3.sup.RecordPk.newBuilder()
                                .setId(new Random().nextInt(100))
                                .build()
                )
                .setData(null)
                .build();

        producerService.produceMessageUP(unrecoverableParameters);
    }
}
