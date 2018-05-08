package com.dygstudio.microservicedemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservice")
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World!";
    }
}
