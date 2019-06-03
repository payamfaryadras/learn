package com.payam.learn.designpatterns.structural.FlyWeight;

public class FlyweightDesignPattern {

    private static final String colors[] = {"RED","GREEN","BLUE"};

    public static void main(String[] args) {
         for(int i = 0 ; i<20;i++){
             AngryBird angryBird = (AngryBird) BirdFactory.getAngryBird(getRandomColor());
             angryBird.draw();
         }
    }

    private static String getRandomColor(){
        return colors[ (int)(Math.random()* colors.length)];
    }

}
