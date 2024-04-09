package com.customer.customerservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class UpdateOrderStatus {

    @KafkaListener(topics = "order-status",groupId = "group-1")
    public void CurrentOrderStatus(String status){

    System.out.println("Current Status  "+status);
    }
}
