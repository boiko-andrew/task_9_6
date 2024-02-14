package ru.netology.task_9_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Task96Application {
    @GetMapping("/opened_endpoint")
    public String openedEndpoint() {
        return "Hello, unauthenticated user!";
    }

    @GetMapping("/closed_endpoint")
    public String closedEndpoint() {
        return "Hello, authenticated user!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Task96Application.class, args);
    }
}