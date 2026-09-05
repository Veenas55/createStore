package com.example.createstore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootTest
class CreateStoreApplicationTests {

    static {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach((entry -> System.setProperty(entry.getKey(), entry.getValue())));
    }

    @Test
    void contextLoads() {
    }

}
