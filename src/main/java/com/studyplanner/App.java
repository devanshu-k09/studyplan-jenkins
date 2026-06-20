package com.studyplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        // This line keeps the application running continuously
        SpringApplication.run(App.class, args);
    }

    // This creates a web page path at http://your-ip/
    @GetMapping("/")
    public String home() {
        return "<h1>Hey Devanshu..! Your Jenkins CI/CD Java Automation Pipeline is Fully Working!</h1>";
    }
}