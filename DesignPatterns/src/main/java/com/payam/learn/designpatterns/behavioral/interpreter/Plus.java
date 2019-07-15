package com.payam.learn.designpatterns.behavioral.interpreter;

import java.util.Map;

public class Plus implements Experssion {
    private Experssion leftExperssion;
    private Experssion rightExperssion;

    public Plus(Experssion leftExperssion, Experssion rightExperssion) {
        this.leftExperssion = leftExperssion;
        this.rightExperssion = rightExperssion;
    }

    @Override
    public int interpret(Map<String, Experssion> variables) {
        return leftExperssion.interpret(variables)+ rightExperssion.interpret(variables);
    }
}
