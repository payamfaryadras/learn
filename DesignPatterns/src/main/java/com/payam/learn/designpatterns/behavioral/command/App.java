package com.payam.learn.designpatterns.behavioral.command;

public class App {
    public static void main(String[] args) {
        EuropeServer server = new EuropeServer();
        Command shutdownCommand = new ShutdownCommand(server);
        ServerCommandInvoker invoker = new ServerCommandInvoker(shutdownCommand);
        invoker.execute();
    }
}
