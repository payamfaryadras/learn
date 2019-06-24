package com.payam.learn.designpatterns.behavioral.command;

public class AsiaServer implements Receiver {
    @Override
    public void connect() {
        System.out.println("ASIA SERVER connect");
    }

    @Override
    public void disconnect() {
        System.out.println("ASIA SERVER disconnect");

    }

    @Override
    public void reboot() {
        System.out.println("ASIA SERVER reboot");

    }

    @Override
    public void shutdown() {
        System.out.println("ASIA SERVER shutdown");

    }
}
