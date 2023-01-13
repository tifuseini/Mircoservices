package com.example.notification.config;

import com.example.notification.event.OrderPlaced;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
public class KakfaListener {

    @KafkaListener(topics = "order-test")
    public void handleOrderNotification(String message) {
        log.info("Order message received: {}", message);
    }

    @KafkaListener(topics = "inventory-test")
    public void handleInventoryNotification(String message) {
        log.info("Inventory message received: {}", message);
    }

}
