package com.payam.learn.designpatterns.structural.bridge;

public class App {
    public static void main(String[] args) {
        Blue blue = new Blue();
        Square square = new Square(blue);
        square.applayColor();
        square.draw();

    }
}
