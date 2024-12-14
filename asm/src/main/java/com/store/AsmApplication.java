package com.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.store.entity") // Quét entity
@EnableJpaRepositories(basePackages = "com.store.dao") // Quét DAO
@ComponentScan(basePackages = "com.store") // Quét toàn bộ component
public class AsmApplication {
    public static void main(String[] args) {
        SpringApplication.run(AsmApplication.class, args);
    }
}
