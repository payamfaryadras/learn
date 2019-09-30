package com.payam.learn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHello {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Coach theCoach = applicationContext.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        CricketCoach cricketCoach = applicationContext.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getTeam());
        System.out.println(cricketCoach.getEmailAddress());
        applicationContext.close();
    }
}
