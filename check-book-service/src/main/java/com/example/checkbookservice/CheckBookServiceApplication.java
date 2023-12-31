package com.example.checkbookservice;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaAdmin;

@SpringBootApplication
public class CheckBookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheckBookServiceApplication.class, args);
    }

    @Bean
    public NewTopic bookTopic(KafkaAdmin kafkaAdmin) {
        return new NewTopic("check-topic", 3, (short) 1);
    }
}