package com.payam.learn.designpatterns.creational.prototype;



public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("draw");
    }
}
