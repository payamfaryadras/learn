package com.payam.learn.designpatterns.behavioral.mediator;

public class App {
    public static void main(String[] args) {
        MessageDelivery messageDelivery = new MessageDelivery();
        Client client1 = new Client(messageDelivery,"@payam");
        Client client2 = new Client(messageDelivery,"@pj");
        client1.sendMessage("@pj","hello");

        Group group = new Group(messageDelivery,"@javalearn");
        group.getClientList().add(client1);
        group.getClientList().add(client2);
        group.sendMessage(null,"hello every one welcome to our group");



    }
}
