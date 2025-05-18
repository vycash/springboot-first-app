package com.springboot.app.springboot_first_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// this class is now a rest class and now able to handle Web requests
public class HelloWorldController { 

    // to make this method as a REST endpoint we use : 
    @GetMapping("/hello-world") // this annotation
    // this method will handle the GET HTTP request at : http://localhost:8080/hello-world
    public String helloWorld(){ return "Hello World!"; }

}
