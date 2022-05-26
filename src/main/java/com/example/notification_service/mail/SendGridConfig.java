package com.example.notification_service.mail;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.sendgrid.SendGrid;

@Configuration
@PropertySource("classpath:application.properties")
public class SendGridConfig {

    @Value("${sendgrid.api.key}")
    String sendGridAPIKey;

    @Bean
    public SendGrid getSendGrid(){
        return new SendGrid(sendGridAPIKey);
    }
}

