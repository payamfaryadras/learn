package com.payam.learn.designpatterns.behavioral.chain.handler;

import com.payam.learn.designpatterns.behavioral.chain.DestinationType;
import com.payam.learn.designpatterns.behavioral.chain.Message;

public class FaxMessageHandler extends AbstractMessageHandler {
    public FaxMessageHandler(AbstractMessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void send(Message message) {
        System.out.println(message.getValue()+" sent by FAX to :"+message.getDist().get(DestinationType.FAX));

    }


}
