package com.payam.learn.designpatterns.structural.FlyWeight;

import java.util.HashMap;

public class BirdFactory {

    private static final HashMap angrybirdMap = new HashMap();

    public static Bird getAngryBird(String color) {
        AngryBird angryBird = (AngryBird) angrybirdMap.get(color);
        if (angryBird == null) {
            angryBird = new AngryBird(color);
            angrybirdMap.put(color, angryBird);
            System.out.println("Creating Angry Bird of color : " + color);
        }
        return angryBird;
    }


}
