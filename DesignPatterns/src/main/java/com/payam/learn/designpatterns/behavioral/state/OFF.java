package com.payam.learn.designpatterns.behavioral.state;


public class OFF implements RemoteControl {
    public static final OFF INSTANCE = new OFF();

    private OFF() {

    }

    @Override
    public void switchState(TV tv) {
        System.out.println("TV is OFF now ...");
        tv.setState(ON.INSTANCE);
        System.out.println("TV is powering ON now ... ");
    }
}
