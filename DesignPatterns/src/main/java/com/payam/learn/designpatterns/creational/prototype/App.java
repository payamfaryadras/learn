package com.payam.learn.designpatterns.creational.prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();


        Shape clonedShape3 = ShapeCache.getShape(3);
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
