package com.payam.learn.designpatterns.behavioral.interpreter;

import java.util.Map;

public class Variable implements Experssion {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Experssion> variables) {
        if(variables.get(name)==null)
            return 0;
        return variables.get(name).interpret(variables);
    }
}
