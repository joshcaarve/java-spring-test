package com.example.joshcaarve.javaspringtest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGretting() {
        return "Hi from Spring Boot";
    }
}
