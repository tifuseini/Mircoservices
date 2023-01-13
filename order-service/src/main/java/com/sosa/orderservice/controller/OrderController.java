package com.sosa.orderservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sosa.orderservice.dto.OrderRequest;
import com.sosa.orderservice.event.OrderPlaced;
import com.sosa.orderservice.models.Order;
import com.sosa.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private final ObjectMapper objectMapper;

    @GetMapping
    public String getOrder() throws JsonProcessingException {
        log.info("Order retrieved");
        var message = objectMapper.writeValueAsString(new OrderPlaced("1", "1", 1, "1"));
        kafkaTemplate.send("order-test", message);
        return "Order retrieved";
    }


}
