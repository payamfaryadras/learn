package com.payam.learn.designpatterns.behavioral.chain;

public class App {
    public static void main(String[] args) {
        Message message = Message.getBuilder().addDist(DestinationType.EMAIL,"payam.ff@gmail.com")
                .addDist(DestinationType.FAX,"021").value("hello").createMessage();
        MessageService.send(message);

    }
}
