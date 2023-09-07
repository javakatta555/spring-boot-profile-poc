package com.example.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Value("${spring.profiles.active:}")
    private String activeProfiles;

    @Value("${message}")
    private String message;

    @GetMapping("/health")
    public String healthCheck(){
        System.out.println("Active profile is:"+activeProfiles);
        System.out.println("message is :"+message);
        return "I am Healthy!";
    }
}
