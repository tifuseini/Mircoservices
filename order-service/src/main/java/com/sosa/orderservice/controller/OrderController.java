package com.sosa.orderservice.controller;

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

    private final KafkaTemplate<String, OrderPlaced> kafkaTemplate;

    @GetMapping
    public String getOrder() {
        log.info("Order retrieved");
        kafkaTemplate.send("order-test", new OrderPlaced("1", "1", 1, "1"));
        return "Order retrieved";
    }


}
