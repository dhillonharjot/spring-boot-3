package com.harjot.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @GetMapping("/")
    public String hello(){
        return "<html>" +
               "<body>" +
               "<h1>Welcome to Harjot's Store</h1>" +
               "<p>What would you like to buy?</p>" +
               // This form sends the data to /orders using the parameter name 'item'
               "<form action='/orders' method='GET'>" +
               "  <input type='text' name='item' placeholder='Enter item name...'>" +
               "  <button type='submit'>Place Order</button>" +
               "</form>" +
               "</body>" +
               "</html>";
    }
}
