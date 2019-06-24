package com.payam.learn.designpatterns.behavioral.command;

public abstract class Command {
    protected final Receiver receiver;

    protected Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
