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

    @GetMapping
    public String getInventory() {
        log.info("Inventory retrieved");
        return "Inventory retrieved";
    }
}
