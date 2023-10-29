package com.springbootmicro.productservice.util;

import com.springbootmicro.productservice.model.Product;
import com.springbootmicro.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        if (productRepository.count() < 1) {
            Product product = new Product();
            product.setName("iPhone 15");
            product.setDescription("Amazing! Cool!");
            product.setPrice(BigDecimal.valueOf(1480));

            productRepository.save(product);
        }
    }
}
