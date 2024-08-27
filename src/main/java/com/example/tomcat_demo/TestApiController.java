package com.example.tomcat_demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

    @GetMapping("/")
    public String sayHello(){
        return "Welcome to Tomcat Server :) ";
    }

}
