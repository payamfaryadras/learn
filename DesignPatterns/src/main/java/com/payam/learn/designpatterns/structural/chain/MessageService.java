package com.payam.learn.designpatterns.structural.chain;

public class MessageService {
    public  void send(Message message){
        AbstractMessageHandler nextHandler;
      //  for (DestinationType destinationType:message.getDestinationType()){
        //    switch (destinationType){
          //      case FAX:
            //        nextHandler = new FaxMesssageHandler(nextHandler);
            //}
       // }
    }
}
