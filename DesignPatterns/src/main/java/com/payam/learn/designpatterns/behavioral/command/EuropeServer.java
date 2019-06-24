package com.payam.learn.designpatterns.behavioral.command;

public class EuropeServer implements Receiver {
    @Override
    public void connect() {
        System.out.println("EUROPE SERVER connect");

    }

    @Override
    public void disconnect() {
        System.out.println("EUROPE SERVER disconnect");

    }

    @Override
    public void reboot() {
        System.out.println("EUROPE SERVER reboot");

    }

    @Override
    public void shutdown() {
        System.out.println("EUROPE SERVER shutdown");

    }
}
