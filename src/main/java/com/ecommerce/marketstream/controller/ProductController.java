package com.ecommerce.marketstream.controller;

import com.ecommerce.marketstream.dto.ProductRequest;
import com.ecommerce.marketstream.dto.ProductResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> findProductById(@PathVariable Long id){
        return ResponseEntity.ok(
                ProductResponse.builder()
                        .name("test")
                        .description("ini test")
                        .price(BigDecimal.ONE)
                        .build()
        );
    }


    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAllProduct(){
        return ResponseEntity.ok(
                List.of(
                        ProductResponse.builder()
                                .name("product2")
                                .description("ini product 2")
                                .price(BigDecimal.ONE)
                                .build(),
                        ProductResponse.builder()
                                .name("product2")
                                .description("ini product 2")
                                .price(BigDecimal.ONE)
                                .build()
                )
        );
    }

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody @Valid ProductRequest request){
        return ResponseEntity.ok(
                ProductResponse.builder()
                        .name(request.getName())
                        .description(request.getDescription())
                        .price(request.getPrice())
                        .build()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponse> updateProduct(@RequestBody @Valid ProductRequest request, @PathVariable Long id){
        return ResponseEntity.ok(
                ProductResponse.builder()
                        .name(request.getName() + " " + id)
                        .description(request.getDescription())
                        .price(request.getPrice())
                        .build()
        );
    }
}
