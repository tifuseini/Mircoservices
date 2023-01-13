package com.sosa.productservice.controller;

import com.sosa.productservice.dto.ProductRequest;
import com.sosa.productservice.dto.ProductResponse;
import com.sosa.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
@Slf4j
public class ProductController {



    @GetMapping
    public String getProduct() {
        log.info("Product retrieved");
        return "Product retrieved";
    }



}
