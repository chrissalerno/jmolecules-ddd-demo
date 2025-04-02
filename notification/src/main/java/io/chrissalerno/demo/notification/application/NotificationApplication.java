package io.chrissalerno.demo.notification.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {
                "io.chrissalerno.demo.notification.application.services",
                "io.chrissalerno.demo.notification.application.config",
                "io.chrissalerno.demo.notification.infrastructure"
        })
@EnableJpaRepositories(
        basePackages = "io.chrissalerno.demo.notification.infrastructure.persistence")
@EntityScan(basePackages = "io.chrissalerno.demo.notification.infrastructure.persistence")
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

}
