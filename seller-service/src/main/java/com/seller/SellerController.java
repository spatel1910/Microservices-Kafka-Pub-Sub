package com.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @PostMapping("/updateOrderStatus")
    public ResponseEntity<String> updateOrderStatus(){

        kafkaTemplate.send("order-status","order in transit");


        return ResponseEntity.ok().build();
    }

}
