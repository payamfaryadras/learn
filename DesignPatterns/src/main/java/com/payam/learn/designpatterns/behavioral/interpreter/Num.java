package com.payam.learn.designpatterns.behavioral.interpreter;


import java.util.Map;

public class Num implements Experssion {
    private int value;

    public Num(int value) {
        this.value = value;
    }


    @Override
    public int interpret(Map<String, Experssion> variables) {
        return value;
    }
}
