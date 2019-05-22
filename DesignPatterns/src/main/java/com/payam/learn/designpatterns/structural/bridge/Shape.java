package com.payam.learn.designpatterns.structural.bridge;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }


    public abstract void applayColor();

    public abstract void draw();


}
