package com.payam.learn.spring;

import java.time.LocalTime;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class MessageBean {

    @Autowired
    MessageSource messageSource;

    public String getMessage() {
        Locale locale = new Locale("EN","US");
        return  LocalTime.now() +messageSource.getMessage("app.lable",null, locale);
    }
}
