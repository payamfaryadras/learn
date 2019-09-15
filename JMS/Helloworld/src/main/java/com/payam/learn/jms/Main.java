package com.payam.learn.jms;

import javax.jms.JMSException;

public class Main {

    public static void main(String[] args) throws JMSException, InterruptedException {
        final SimpleMessageSender simpleMessageSender = new SimpleMessageSender();
        final SimpleMessageReceiver simpleMessageReceiver = new SimpleMessageReceiver();
        simpleMessageReceiver.startListener();
        for (int i=0 ; i<5; i++){
            String message = "Hello world "+i;
            simpleMessageSender.sendMessage(message);
            Thread.sleep(300);

        }
        simpleMessageReceiver.destroy();
        simpleMessageSender.destroy();


    }

}
