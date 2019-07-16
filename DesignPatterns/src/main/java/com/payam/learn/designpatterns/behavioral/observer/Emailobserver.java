package com.payam.learn.designpatterns.behavioral.observer;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class Emailobserver implements Observer {
    public String[] emailAddress;

    public Emailobserver(String... emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(Observable o, Object arg) {
        Arrays.stream(emailAddress).forEach(str -> {
            System.out.println(String.format("SENDING EMAIL TO : %s .MESSAGE: %s", str, arg));
        });
    }
}
