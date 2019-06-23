package com.payam.learn.designpatterns.structural.chain;

public class FaxMesssageHandler extends AbstractMessageHandler {
    protected FaxMesssageHandler(AbstractMessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        System.out.println("Send via Fax");
    }
}
