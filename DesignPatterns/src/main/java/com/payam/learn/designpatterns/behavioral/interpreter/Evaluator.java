package com.payam.learn.designpatterns.behavioral.interpreter;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements Experssion {
    private Experssion syntaxFree;

    public  Evaluator(final String experssion) {
        final Stack<Experssion> experssionStack = new Stack<>();
        for (String token : experssion.split(" ")) {
            switch (token) {
                case "+":
                    final Experssion addExperssion = new Plus(experssionStack.pop(), experssionStack.pop());
                    experssionStack.push(addExperssion);
                    break;
                case "-":
                    final Experssion minusExperssion = new Minus(experssionStack.pop(), experssionStack.pop());
                    experssionStack.push(minusExperssion);
                    break;
                default:
                    experssionStack.push(new Variable(token));
                    break;
            }
        }
        syntaxFree = experssionStack.pop();

    }


    @Override
    public int interpret(Map<String, Experssion> variables) {
        return syntaxFree.interpret(variables);
    }
}
