package com.payam.learn.designpatterns.behavioral.state;

public class TV {


    private RemoteControl state;

    public TV(RemoteControl state) {
        this.state = state;
    }
    public RemoteControl getState() {
        return state;
    }

    protected void setState(RemoteControl state) {
        this.state = state;
    }

    public void togglePower() {
        state.switchState(this);
    }
}
