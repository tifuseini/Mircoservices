package com.sosa.orderservice.controller;

import com.sosa.orderservice.dto.OrderRequest;
import com.sosa.orderservice.models.Order;
import com.sosa.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    @GetMapping
    public String getOrder() {
        log.info("Order retrieved");
        return "Order retrieved";
    }


}
