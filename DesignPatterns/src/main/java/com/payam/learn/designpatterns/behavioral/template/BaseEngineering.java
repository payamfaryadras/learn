package com.payam.learn.designpatterns.behavioral.template;

public abstract class BaseEngineering {

    public void study(){
        math();
        physics();
        additionalStudy();
    }

    protected abstract void additionalStudy();

    private void physics() {
    }

    private void math() {
    }


}
