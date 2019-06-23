package com.payam.learn.designpatterns.structural.chain;

public class EmailMessageHandler extends AbstractMessageHandler {
    protected EmailMessageHandler(AbstractMessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        System.out.println("Send via Email.");
    }
}
