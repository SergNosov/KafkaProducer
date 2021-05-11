package com.sml.kafkaproducer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sml.kafkaproducer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nlmk.l3.ccm.pgp.AttestationRequest;
import nlmk.l3.sup.EnumOp;
import nlmk.l3.sup.IntegralParameters;
import nlmk.l3.sup.RecordPk;
import io.micrometer.core.instrument.util.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Random;

import unrecoverableparameterstrends.nlmk.l3.sup.UnrecoverableParametersTrends;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @GetMapping({"/request/{erase}","/request"})
    public void sendReq(@PathVariable(required = false) boolean erase) throws FileNotFoundException, JsonProcessingException {

        AttestationRequest value = new ObjectMapper()
                .setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"))
                .readValue(getJsonAttestationRequest(), AttestationRequest.class);

        if (erase) {
            log.info("--- setting Op to D");
            value.setOp(nlmk.l3.ccm.pgp.EnumOp.D);
        }

        producerService.produceMessageReq(value);
    }

    private String getJsonAttestationRequest() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("src/main/resources/avro/AttestationRequest28042021.json");
        String stringTooLong = IOUtils.toString(fis);

        return stringTooLong;
    }

    @GetMapping("/integral_parameters/{correct}")
    public void sendIP(@PathVariable boolean correct) {

        producerService.produceMessageIP(generateFromJson());
    }

    private IntegralParameters generateIP(boolean correct) {

        int idRecordPK = 0;

        if (correct) idRecordPK = new Random().nextInt(100);

        IntegralParameters integralParameters = IntegralParameters.newBuilder()
                .setTs(LocalDateTime.now().toString())
                .setOp(EnumOp.I)
                .setPk(
                        RecordPk.newBuilder()
                                .setId(idRecordPK)
                                .build()
                )
                .setData(null)
                .build();

        return integralParameters;
    }

    private IntegralParameters generateFromJson() {
        IntegralParameters ip = generateIP(true);

        try {
            String json = "{\"ts\": \"2021-04-16T08:17:28.811-03:00\", \"op\": \"U\", \"pk\": {\"id\": 5}, \"data\": {\"primeId\": \"0001020210416033915922670\", \"kceh\": 12, \"kcehName\": \"ЦГП\", \"unitCode\": 37, \"unitName\": \"Стан 2000 (П3)\", \"werks\": 1011, \"werksName\": \"NLMK\", \"specifications\": [{\"specCode\": 11, \"specName\": \"Уставка на Ткп (min)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 835.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 12, \"specName\": \"Уставка на Ткп (max)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 875.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 9, \"specName\": \"Уставка на Тсм (min)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 650.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 10, \"specName\": \"Уставка на Тсм (max)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 690.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 18, \"specName\": \"Процент длины полосы, на которой ширина в допуске (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 98.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 13, \"specName\": \"Величина среднего профиля (выпуклости) полосы (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 36.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 14, \"specName\": \"Величина средней клиновидности полосы (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": -6.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 20, \"specName\": \"СККП: Наибольшая критичность дефекта на полосе\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 2.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 17, \"specName\": \"Процент длины полосы, на которой толщина входит в полный допуск (СГП) (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 100.0, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 15, \"specName\": \"Процент длины полосы, на которой толщина входит в (1/2) допуска (СГП) (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 97.12, \"specFormat\": null, \"specMeasure\": null}, {\"specCode\": 16, \"specName\": \"Процент длины полосы, на которой толщина входит в (2/3) допуска (СГП) (М12-02)\", \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 99.37, \"specFormat\": null, \"specMeasure\": null}]}}\n";
            ip = new ObjectMapper().registerModule(new JavaTimeModule())
                    .readValue(json, IntegralParameters.class);

            //ip.getData().getSpecifications().clear();

        } catch (JsonProcessingException jpe) {
            System.err.println("--- jpe: " + jpe.getMessage());
            ip = generateIP(true);
        }

        return ip;
    }

    @GetMapping("/unrecoverable_parameters")
    public void sendUP() throws JsonProcessingException {

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
        String json = "{\"ts\": \"2021-04-16T08:17:28.898-03:00\",\n" +
                "  \"op\": \"U\",\n" +
                "  \"pk\": {\"id\": 144954755},\n" +
                "  \"data\": {\n" +
                "    \"primeID\": \"0001020210416033915922670\",\n" +
                "    \"kceh\": 12,\n" +
                "    \"kcehName\": \"ЦГП\",\n" +
                "    \"unitCode\": 37,\n" +
                "    \"unitName\": \"Стан 2000 (П3)\",\n" +
                "    \"werksCode\": 1011,\n" +
                "    \"werksName\": \"NLMK\",\n" +
                "    \"specifications\": [\n" +
                "      {\n" +
                "        \"specCode\": 19,\n" +
                "        \"specName\": \"Высота местных утолщений по ширине полосы (М12-07)\",\n" +
                "        \"specTypeCode\": 1, \"specTypeName\": \"number\", \"specValue\": 7.0,\n" +
                "        \"specFormat\": null,\n" +
                "        \"specMeasure\": null\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}\n";
        UnrecoverableParametersTrends up = new ObjectMapper().registerModule(new JavaTimeModule())
                .readValue(json, UnrecoverableParametersTrends.class);


        producerService.produceMessageUP(up);
    }
}
