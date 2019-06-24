package com.payam.learn.designpatterns.behavioral.command;

public interface Receiver {
    void connect();
    void disconnect();
    void reboot();
    void shutdown();
}
