package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class paymentController {

    @GetMapping("/getPayment")
    public String getPayment(){
        return "Payment is being proceeded!";
    }
}
