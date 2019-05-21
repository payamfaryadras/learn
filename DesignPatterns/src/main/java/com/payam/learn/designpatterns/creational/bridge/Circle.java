package com.payam.learn.designpatterns.creational.bridge;

public  class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applayColor() {
        color.applyColor();
    }

    @Override
    public void draw() {
        System.out.println("draw...");
    }
}
