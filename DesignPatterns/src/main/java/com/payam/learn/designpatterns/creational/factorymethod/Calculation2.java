package com.payam.learn.designpatterns.creational.factorymethod;

public class Calculation2 extends Calculation {

    public Calculation2(long amountPerMonth, long taxPercent, String product) {
        super(amountPerMonth, taxPercent, product);
    }

    @Override
    public Long calculate() {
        return amountPerMonth*taxPercent+100;
    }
}
