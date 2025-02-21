package com.UC2webPage.controller;

import com.UC2webPage.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        Message message = new Message("Hello from BridgeLabz!");
        model.addAttribute("message", message.getMessage());
        return "hello";  // This will map to hello.html
    }
}




