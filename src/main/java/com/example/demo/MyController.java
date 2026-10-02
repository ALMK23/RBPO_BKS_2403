package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    //http://localhost:24069/text
    @GetMapping("/text")
    public String getText() {
        return "Hello, World! :D";
    }

    //http://localhost:24069/number
    @GetMapping("/number")
    public Integer getNumber() {
        return 24069;
    }
}