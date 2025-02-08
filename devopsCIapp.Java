package com.tonnomdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyDevopsApp {

    @GetMapping
    public String message(){
        return "Bienvenue dans mon projet DevOps personnalisé !";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyDevopsApp.class, args);
    }
}
