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

    private final OrderService orderService;

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public void createOrder(@RequestBody Order order) {
//        orderService.createOrder(order);
//    }

    @PostMapping
    public void createOrder(){
        log.info("Order created");
    }

    @GetMapping
    public void getOrder(){
        log.info("Order retrieved");
    }

    @DeleteMapping
    public void deleteOrder(){
        log.info("Order deleted");
    }

    @PutMapping
    public void updateOrder(){
        log.info("Order updated");
    }
}
