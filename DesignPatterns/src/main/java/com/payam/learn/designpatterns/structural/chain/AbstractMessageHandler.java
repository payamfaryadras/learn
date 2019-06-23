package com.payam.learn.designpatterns.structural.chain;

public  abstract  class AbstractMessageHandler {
    private final AbstractMessageHandler nextHandler;

    protected AbstractMessageHandler(AbstractMessageHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void handle(Message message);
}
