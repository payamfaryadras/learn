package com.payam.learn.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.payam.learn.springdemo")
@PropertySource("classpath:sport.properties")
public class SpringConfig {
}
