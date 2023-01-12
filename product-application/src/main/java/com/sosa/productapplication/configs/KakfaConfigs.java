package com.sosa.productapplication.configs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
public class KakfaConfigs {

    @KafkaListener(topics = "inventory-test")
    public void handleInventoryNotification(String message) {
        log.info("Inventory message received: {}", message);
    }

}
