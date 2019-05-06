package com.payam.learn.designpatterns.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DBConnectionTest {

    @Test
    public void doSomthing() {

        DBConnection object1 = DBConnection.INSTANCE;
        DBConnection object2 = DBConnection.INSTANCE;
        Assert.assertEquals(true,object1.equals(object2));

    }
}