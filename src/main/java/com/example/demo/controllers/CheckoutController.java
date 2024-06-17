package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;
import com.example.demo.services.CheckoutService;
import com.example.demo.services.Purchase;
import com.example.demo.services.PurchaseResponse;

@CrossOrigin
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private final CheckoutService checkoutService;

    // Constructor-based dependency injection for CheckoutService
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        // Directly returning the result of the placeOrder service call
        return checkoutService.placeOrder(purchase);
    }
}