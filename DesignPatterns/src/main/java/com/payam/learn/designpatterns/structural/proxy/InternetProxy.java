package com.payam.learn.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {

    private RealInternet realInternet;
    private static List<String> bandedSites = new ArrayList<>();

    static {
        bandedSites.add("google.com");
    }

    public InternetProxy(RealInternet realInternet) {
        this.realInternet = realInternet;
    }


    public void connectTo(String server) throws Exception {
        System.out.println("do sth before connecting");
        if (bandedSites.contains(server)) {
            throw new Exception("Access denied");
        }
        realInternet.connectTo(server);

        System.out.println("after connecting");
    }
}
