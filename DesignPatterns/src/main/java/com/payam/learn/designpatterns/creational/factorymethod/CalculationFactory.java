package com.payam.learn.designpatterns.creational.factorymethod;

public class CalculationFactory {

    public static Calculation createCalculator(long amountPerMonth, long taxPercent, String product, boolean ferstival) {

        if (ferstival) {
            return new Calculation1(amountPerMonth, taxPercent, product);
        }
        return new Calculation2(amountPerMonth, taxPercent, product);


    }
}
