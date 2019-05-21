package com.payam.learn.designpatterns.creational.bridge;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }


    public abstract void applayColor();

    public abstract void draw();


}
