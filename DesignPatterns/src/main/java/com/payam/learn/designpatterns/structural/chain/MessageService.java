package com.payam.learn.designpatterns.structural.chain;

import com.payam.learn.designpatterns.structural.chain.handler.AbstractMessageHandler;
import com.payam.learn.designpatterns.structural.chain.handler.EmailMessageHandler;
import com.payam.learn.designpatterns.structural.chain.handler.FaxMessageHandler;
import com.payam.learn.designpatterns.structural.chain.handler.SMSMessageHandler;

public class MessageService {
    public static   void send(Message message){
        AbstractMessageHandler nextHandler = null;
        for (DestinationType destinationType:message.getDist().keySet()){
            switch (destinationType){
                case FAX:
                    nextHandler = new FaxMessageHandler(nextHandler);
                    break;
                case EMAIL:
                    nextHandler =new EmailMessageHandler(nextHandler);
                    break;
                case SMS:
                    nextHandler = new SMSMessageHandler(nextHandler);

            }

        }
        if(nextHandler!=null){
            nextHandler.handle(message);
        }
    }
}
