package com.payam.learn.designpatterns.behavioral.command;

public class ShutdownCommand extends Command {
    protected ShutdownCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.shutdown();
        receiver.disconnect();
    }
}
