package com.payam.learn.designpatterns.creational.factorymethod;

public class Calculation1 extends Calculation {


    public Calculation1(long amountPerMonth, long taxPercent, String product) {
        super(amountPerMonth, taxPercent, product);
    }

    @Override
    public Long calculate() {
        return amountPerMonth*taxPercent+200;
    }
}
