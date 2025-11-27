package com.ecommerce.marketstream.controller;

import com.ecommerce.marketstream.common.errors.BadRequestException;
import com.ecommerce.marketstream.common.errors.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello (){
        return "Hello world";
    }

    @GetMapping("/not-found")
    public ResponseEntity<String> notFoundError(){
        throw new ResourceNotFoundException("data gaada");
    }

    @GetMapping("/bad-request")
    public ResponseEntity<String> badRequestError(){
        throw new BadRequestException("bad request");
    }

    @GetMapping("/generic-exception")
    public ResponseEntity<String> genericException(){
        throw new RuntimeException("generic exception");
    }

}
