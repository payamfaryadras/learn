package com.payam.learn.designpatterns.structural.composite;

public class MenuItem extends MenuComponnet {
    public MenuItem(String url, String name) {
        super(url, name);
    }

    @Override
    public String toString() {
        return "\t::item:"+print();
    }
}
