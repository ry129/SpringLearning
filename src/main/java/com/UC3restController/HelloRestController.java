package com.UC3restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String index() {
        return "Hello From BridgeLabz";
    }
}
