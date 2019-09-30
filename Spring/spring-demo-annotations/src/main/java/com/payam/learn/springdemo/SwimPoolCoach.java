package com.payam.learn.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SwimPoolCoach implements Coach {


    @Value("${foo.emailAddress}")
    private String emailAddress;
    @Value("${foo.team}")
    private String team;


    @Override
    public String getDailyWorkout() {
        return "pool";
    }

    @Override
    public String getDailyFortune() {
        return "pool!";
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
