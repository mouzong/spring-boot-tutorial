package com.codegrill.Springboot.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloworld() {
        return "Welcome to the @CodeGrill scopisco";
    }
}
