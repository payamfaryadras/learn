package com.payam.learn.designpatterns.creational.bridge;

public  class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applayColor() {
        color.applyColor();
    }

    @Override
    public void draw() {
        System.out.println("draw");
    }
}
