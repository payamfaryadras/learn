package com.payam.learn.designpatterns.behavioral.state;

public class ON implements RemoteControl {
    public static final ON INSTANCE = new ON();

    private ON() {
    }

    @Override
    public void switchState(TV tv) {
        System.out.println("TV is ON now ...");
        tv.setState(OFF.INSTANCE);
        System.out.println("TV is powering OFF now ... ");
    }
}
