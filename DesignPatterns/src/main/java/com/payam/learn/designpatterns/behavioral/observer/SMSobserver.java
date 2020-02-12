package com.payam.learn.designpatterns.behavioral.observer;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class SMSobserver implements Observer {
    public String[] phoneNumbers;

    public SMSobserver(String... phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public void update(Observable o, Object arg) {
        Arrays.stream(phoneNumbers).forEach(str -> {
            System.out.println(String.format("SENDING PHONE TO : %s .MESSAGE: %s", str, arg));
        });
    }
}