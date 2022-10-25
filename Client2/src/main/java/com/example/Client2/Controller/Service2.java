package com.example.Client2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class Service2 {
    @GetMapping("/service2")

    public String getService2(){
        return "Hey , Service2 is called";
    }
}
