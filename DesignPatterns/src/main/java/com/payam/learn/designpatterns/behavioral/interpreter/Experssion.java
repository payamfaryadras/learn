package com.payam.learn.designpatterns.behavioral.interpreter;

import java.util.Map;

public interface Experssion {
    int interpret(final Map<String,Experssion> variables);
}
