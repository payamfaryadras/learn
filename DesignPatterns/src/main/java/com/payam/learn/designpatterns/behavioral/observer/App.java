package com.payam.learn.designpatterns.behavioral.observer;

public class App {
    public static void main(String[] args) {
        MessageSubject messageSubject = new MessageSubject();
        messageSubject.addObserver(new Emailobserver("payam.ff@gmail.com"));
        messageSubject.addObserver(new SMSobserver("980912"));
        messageSubject.addObserver(new Telegramobserver("56778888"));
        messageSubject.receiveMessage("hello ");
    }
}
