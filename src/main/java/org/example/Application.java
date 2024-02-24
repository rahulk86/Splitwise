package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.oauth2.client.OAuth2ClientSecurityMarker;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;

@SpringBootApplication
@EntityScan(basePackages = {"com.auth.modal","org.example.models"})
@EnableJpaRepositories(basePackages = {"com.auth.repository","org.example.repositories"})
@ComponentScan(basePackages = {"com.auth","org.example"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}