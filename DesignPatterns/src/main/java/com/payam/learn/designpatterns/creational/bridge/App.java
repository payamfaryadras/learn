package com.payam.learn.designpatterns.creational.bridge;

public class App {
    public static void main(String[] args) {
        Blue blue = new Blue();
        Square square = new Square(blue);
        square.applayColor();
        square.draw();

    }
}
