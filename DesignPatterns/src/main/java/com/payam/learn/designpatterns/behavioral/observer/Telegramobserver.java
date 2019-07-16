package com.payam.learn.designpatterns.behavioral.observer;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class Telegramobserver implements Observer {
    public String[] telgramId;

    public Telegramobserver(String... telgramId) {
        this.telgramId = telgramId;
    }

    @Override
    public void update(Observable o, Object arg) {
        Arrays.stream(telgramId).forEach(str -> {
            System.out.println(String.format("SENDING TELEGRAMID TO : %s .MESSAGE: %s", str, arg));
        });
    }
}