package com.developer.springbootjokeapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:chuck-config.xml")
public class SpringBootJokeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJokeAppApplication.class, args);
    }

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotesBean() {
        return new ChuckNorrisQuotes();
    }

}
