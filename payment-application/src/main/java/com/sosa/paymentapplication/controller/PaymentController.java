package com.sosa.paymentapplication.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sosa.paymentapplication.event.PaymentEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment")
@Slf4j
@RequiredArgsConstructor
public class PaymentController {

    private final KafkaTemplate<String,String> kafkaTemplate;

    private final ObjectMapper objectMapper;

    @GetMapping
    public String getPayment() throws JsonProcessingException {
        log.info("Payment retrieved");
        var message  = objectMapper
                .writeValueAsString(new PaymentEvent("1","1","1","1",1,"1"));
        kafkaTemplate.send("payment-test",message);
        return "Payment received";
    }
}
