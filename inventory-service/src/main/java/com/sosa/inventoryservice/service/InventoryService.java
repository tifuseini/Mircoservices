package com.sosa.inventoryservice.service;

import com.sosa.inventoryservice.event.InventoryEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    public void sendNotification() {
        kafkaTemplate.send("inventory-test", "Hello World");
        log.info("Inventory message sent");
    }
}
