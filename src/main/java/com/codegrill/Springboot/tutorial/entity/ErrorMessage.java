package com.codegrill.Springboot.tutorial.entity;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
    private HttpStatus responseStatusCode;
    private String responseMessage;
}
