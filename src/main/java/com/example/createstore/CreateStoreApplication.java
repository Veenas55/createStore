package com.example.createstore;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreateStoreApplication {
    public static void main(String[] args) {
        // configuration of dotenv-java
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach((entry -> System.setProperty(entry.getKey().trim(), entry.getValue().trim())));

        SpringApplication.run(CreateStoreApplication.class, args);
    }
}