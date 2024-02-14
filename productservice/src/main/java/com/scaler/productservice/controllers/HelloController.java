package com.scaler.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This class will have multiple methods that will be serving HTTP requests at /hello
//@RestController --> This class will be serving REST HTTP APIs
//localhost:8080/hello
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/say/{name}")
    public String sayHello(@PathVariable("name") String name)
    {
        return "Hello there!" + name;
    }
}
