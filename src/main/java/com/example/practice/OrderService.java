package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final PaymentService paymentService;
    @Autowired
    public OrderService(@Qualifier("paypal") PaymentService paymentService) {
        System.out.println("OrderService constructor");
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(100);
    }
}
