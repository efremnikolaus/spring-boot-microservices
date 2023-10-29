package com.springbootmicro.productservice.controller;

import com.springbootmicro.productservice.dto.ProductRequest;
import com.springbootmicro.productservice.dto.ProductResponse;
import com.springbootmicro.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
