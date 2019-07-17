package com.payam.learn.designpatterns.behavioral.state;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TVTest {

    @Test
    public void WHEN_PRESS_TOGGLE_POWER_STATE_CHANGED() {
        TV  tv = new TV(OFF.INSTANCE);
        tv.togglePower();
        Assert.assertEquals(ON.INSTANCE,tv.getState());
    }
}