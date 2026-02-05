package com.harjot.demo.controllers;
    
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public String getAllOrders(@RequestParam(required = false) String item) {
        if(item == null || item.isBlank()){
            return "Please provide an item to order. Example=/orders?item=burger";
        }
        return "Your order for " + item + " has been placed.";
    }
}
