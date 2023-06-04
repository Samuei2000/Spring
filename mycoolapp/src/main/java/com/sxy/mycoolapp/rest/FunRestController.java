package com.sxy.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@RestController-->Set up rest controller
@RestController
public class FunRestController {

    // expose "/" that return "Hello World"
    //@GetMapping-->Handle HTTP GET requests
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}