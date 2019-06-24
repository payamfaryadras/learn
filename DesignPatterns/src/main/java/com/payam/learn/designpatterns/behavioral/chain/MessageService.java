package com.payam.learn.designpatterns.behavioral.chain;

import com.payam.learn.designpatterns.behavioral.chain.handler.AbstractMessageHandler;
import com.payam.learn.designpatterns.behavioral.chain.handler.EmailMessageHandler;
import com.payam.learn.designpatterns.behavioral.chain.handler.FaxMessageHandler;
import com.payam.learn.designpatterns.behavioral.chain.handler.SMSMessageHandler;

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
