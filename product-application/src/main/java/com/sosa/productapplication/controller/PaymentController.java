package com.sosa.productapplication.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment")
@Slf4j
public class PaymentController {

    @GetMapping
    public String getPayment() {
        log.info("Product from Application retrieved");
        return "Product from application retrieved";
    }
}
