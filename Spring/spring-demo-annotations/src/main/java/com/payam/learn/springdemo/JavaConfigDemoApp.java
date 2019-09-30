package com.payam.learn.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        SwimPoolCoach swimPoolCoach = context.getBean("swimPoolCoach",SwimPoolCoach.class);
        System.out.println(swimPoolCoach.getTeam());
        System.out.println(swimPoolCoach.getEmailAddress());
    }
}
