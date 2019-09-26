package com.payam.learn.spring.config;

import com.payam.learn.spring.model.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorld helloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello world!");
        return helloWorld;
    }
}
