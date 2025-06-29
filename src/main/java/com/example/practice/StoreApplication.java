package com.example.practice;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L, "anshu280504@gmail.com", "12477", "Anshuman"));
        //userService.registerUser(new User(1L, "anshu280504@gmail.com", "12477", "Anshuman"));

    }

}
