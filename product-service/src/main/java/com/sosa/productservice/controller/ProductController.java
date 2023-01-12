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

    private final ProductService productService;

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public void createProduct(@RequestBody ProductRequest productRequest) {
//
//        productService.createProduct(productRequest);
//
//    }
//
//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public List<ProductResponse> getAllProducts() {
//
//        log.info("Getting all products");
//
//        return productService.getAllProducts();
//
//    }

    @PostMapping
    public void createProduct(){
        log.info("Product created");
    }

    @GetMapping
    public void getProduct(){
        log.info("Product retrieved");
    }

    @DeleteMapping
    public void deleteProduct(){
        log.info("Product deleted");
    }

    @PutMapping
    public void updateProduct(){
        log.info("Product updated");
    }



}
