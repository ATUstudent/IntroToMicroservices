package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/greet/name")
    public String greetByName(@PathVariable String name) {
        return "Hello"+ name + "!";
    }
}