package com.payam.learn.designpatterns.structural.composite;

public class Menu extends MenuComponnet {


    public Menu(String url, String name) {
        super(url, name);
    }

    @Override
    public MenuComponnet add(MenuComponnet menuComponnet) {
         getChildren().add(menuComponnet);
         return this;
    }

    @Override
    public MenuComponnet remove(MenuComponnet menuComponnet) {
        getChildren().remove(menuComponnet);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("::menu::");
        builder.append(print());
        getChildren().forEach(leaf-> builder.append(leaf.toString()));
        return builder.toString();
    }
}
