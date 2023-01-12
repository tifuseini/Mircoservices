package com.sosa.inventoryservice.controller;

import com.sosa.inventoryservice.models.Inventory;
import com.sosa.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/inventory")
@Slf4j
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @PostMapping
    public void createInventory() {
        inventoryService.sendNotification();
        log.info("Inventory created");
    }

    @GetMapping
    public void getInventory() {
        log.info("Inventory retrieved");
    }

    @DeleteMapping
    public void deleteInventory() {
        log.info("Inventory deleted");
    }

    @PutMapping
    public void updateInventory() {
        log.info("Inventory updated");
    }

}
