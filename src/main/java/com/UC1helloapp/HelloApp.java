package com.UC1helloapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApp {
    @GetMapping("helo")
    public String helo() {
        return "Hello Welcome To BridgeLabz !!";
    }
}
