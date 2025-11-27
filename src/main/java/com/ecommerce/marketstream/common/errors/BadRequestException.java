package com.ecommerce.marketstream.common.errors;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message){
        super(message);
    }
}
