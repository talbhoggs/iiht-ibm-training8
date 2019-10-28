package com.ibm.ph.amperca.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.ibm.ph.amperca.persistence.repo")
@EntityScan("com.ibm.ph.amperca.persistence.model")
@SpringBootApplication(scanBasePackages = {"com.ibm.ph.amperca.controller"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
