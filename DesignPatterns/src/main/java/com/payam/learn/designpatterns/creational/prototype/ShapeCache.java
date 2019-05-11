package com.payam.learn.designpatterns.creational.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<Integer, Shape> shapeMap  = new Hashtable<Integer, Shape>();

    public static Shape getShape(int shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {

        Rectangle rectangle = new Rectangle();
        rectangle.setId(3);
        shapeMap.put(rectangle.getId(), rectangle);
    }


}
