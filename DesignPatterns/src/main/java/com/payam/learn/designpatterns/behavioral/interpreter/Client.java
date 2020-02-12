package com.payam.learn.designpatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        final String experssion ="w x z + -";
        final Evaluator sentens = new Evaluator(experssion);
        final Map<String,Experssion> variables =new HashMap<>();
        variables.put("w",new Num(3));
        variables.put("x",new Num(5));
        variables.put("z",new Num(4));
        final int result = sentens.interpret(variables);
        System.out.println(result);
    }
}
