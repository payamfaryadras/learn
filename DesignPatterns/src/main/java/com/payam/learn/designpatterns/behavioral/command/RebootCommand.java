package com.payam.learn.designpatterns.behavioral.command;

public class RebootCommand extends Command {
    protected RebootCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.reboot();
        receiver.disconnect();
    }
}
