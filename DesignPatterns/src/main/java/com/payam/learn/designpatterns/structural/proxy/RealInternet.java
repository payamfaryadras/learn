package com.payam.learn.designpatterns.structural.proxy;

public class RealInternet implements Internet {

   public void connectTo(String server) {
        System.out.println("real Internet connect...");
    }
}
