package com.example.createstore;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreateStoreApplication {
    public static void main(String[] args) {
        // configuration of dotenv-java
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach((entry -> System.setProperty(entry.getKey(), entry.getValue())));

        System.out.println("DATABASE_USERNAME = " + System.getProperty("DATABASE_USERNAME"));
        SpringApplication.run(CreateStoreApplication.class, args);
    }
}