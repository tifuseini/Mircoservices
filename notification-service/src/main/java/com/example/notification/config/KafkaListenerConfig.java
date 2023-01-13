package com.example.notification.config;

import com.example.notification.event.InventoryEvent;
import com.example.notification.event.OrderPlaced;
import com.example.notification.event.PaymentEvent;
import com.example.notification.event.ProductEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class KafkaListenerConfig {

    private final ObjectMapper objectMapper;

    @KafkaListener(topics = "order-test")
    public void handleOrderNotification(String message) throws JsonProcessingException {
        var orderPlaced = objectMapper.readValue(message, OrderPlaced.class);
        log.info("Order message received: {}", orderPlaced);
    }

    @KafkaListener(topics = "inventory-test")
    public void handleInventoryNotification(String message) throws JsonProcessingException {
        var inventory = objectMapper.readValue(message, InventoryEvent.class);
        log.info("Inventory message received: {}", inventory);
    }

    @KafkaListener(topics = "product-test")
    public void handleProductNotification(String message) throws JsonProcessingException {
        var product = objectMapper.readValue(message, ProductEvent.class);
        log.info("Product message received: {}", product);
    }

    @KafkaListener(topics = "payment-test")
    public void handlePaymentNotification(String message) throws JsonProcessingException {
        var payment = objectMapper.readValue(message, PaymentEvent.class);
        log.info("Payment message received: {}", payment);
    }


}
