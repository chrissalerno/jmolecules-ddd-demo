package io.chrissalerno.demo.offer.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {
                "io.chrissalerno.demo.offer.application.services",
                "io.chrissalerno.demo.offer.infrastructure"
        })
@EnableJpaRepositories(
        basePackages = "io.chrissalerno.demo.offer.infrastructure.persistence")
@EntityScan(basePackages = "io.chrissalerno.demo.offer.infrastructure.persistence")
public class OfferApplication {

    public static void main(String[] args) {
        SpringApplication.run(OfferApplication.class, args);
    }

}
