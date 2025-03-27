package com.ingka.demo.notification.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {
                "com.ingka.demo.notification.application.services",
                "com.ingka.demo.notification.application.config",
                "com.ingka.demo.notification.infrastructure"
        })
@EnableJpaRepositories(
        basePackages = "com.ingka.demo.notification.infrastructure.persistence")
@EntityScan(basePackages = "com.ingka.demo.notification.infrastructure.persistence")
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

}
