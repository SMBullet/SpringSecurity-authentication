package com.ms.ms_secure_sign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "Welcome!!!!";
    }

    @GetMapping("/api")
    public String secure() {
        return "Secuuuuure!!!!";
    }
}