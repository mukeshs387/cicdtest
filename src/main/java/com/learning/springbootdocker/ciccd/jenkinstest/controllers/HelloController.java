package com.learning.springbootdocker.ciccd.jenkinstest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/welcome")
    public String getMessage() {
        return "Hello CI-CD pipelines !!" ;
    }
}
