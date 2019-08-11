package com.demo.app;

import com.sender.demo.SenderTemplate;
import com.sender.demo.services.NotificationSenderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



    @Bean
    public CommandLineRunner commandLineRunner(NotificationSenderService senderService){

        return args -> {
           senderService.sendSmsNotification("", SenderTemplate.SMS);
        };


    }
}
