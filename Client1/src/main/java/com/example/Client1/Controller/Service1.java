package com.example.Client1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/services")
public class Service1 {
    @Autowired
    private RestTemplate template;


    @GetMapping("/service1")
    public String getService1() {
        return template.getForObject("http://PAYMENT-SERVICE/payment/getPayment", String.class);
    }


}
