package com.seller;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class SellerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellerServiceApplication.class, args);
	}

	@Bean
	public NewTopic getBean(){
		return TopicBuilder.name("order-status").build();
	}


}
