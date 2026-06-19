package com.fotballai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FootballAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FootballAiApplication.class, args);

        String port = System.getProperty("server.port");
        if (port == null || port.isBlank()) {
            port = "8080";
        }

        System.out.println("=================================");
        System.out.println("FootballAi started successfully!");
        System.out.println("Application: http://localhost:" + port);
        System.out.println("Swagger UI:  http://localhost:" + port + "/swagger-ui.html");
        System.out.println("OpenAPI:     http://localhost:" + port + "/v3/api-docs");
        System.out.println("=================================");
    }
}