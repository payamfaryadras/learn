package com.payam.learn.designpatterns.structural.chain;

public class SMSMessageHandler extends AbstractMessageHandler {
    protected SMSMessageHandler(AbstractMessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        System.out.println("Send via SMS");
    }
}
