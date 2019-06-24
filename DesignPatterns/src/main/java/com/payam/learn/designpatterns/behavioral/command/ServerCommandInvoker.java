package com.payam.learn.designpatterns.behavioral.command;

public class ServerCommandInvoker {
    private final Command command;

    public ServerCommandInvoker(Command command) {
        this.command = command;
    }
    public void execute(){
        command.execute();
    }
}
