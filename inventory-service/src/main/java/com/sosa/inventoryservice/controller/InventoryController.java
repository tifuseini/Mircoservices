package com.sosa.inventoryservice.controller;

import com.sosa.inventoryservice.event.InventoryEvent;
import com.sosa.inventoryservice.models.Inventory;
import com.sosa.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/inventory")
@Slf4j
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    private final KafkaTemplate<String,Object> kafkaTemplate;

    @GetMapping
    public String getInventory() {
        log.info("Inventory retrieved");
        var message = new InventoryEvent("1", "1", 1, "1");
        kafkaTemplate.send("inventory-test", message);
        return "Inventory retrieved";
    }
}
