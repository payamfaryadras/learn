package com.payam.learn.designpatterns.creational.factorymethod;

public class CalculationFactory {

    public static Calculation createCalculator(long amountPerMonth, long taxPercent, String product, boolean isCalculation1) {

        if (isCalculation1) {
            return new Calculation1(amountPerMonth, taxPercent, product);
        }
        return new Calculation2(amountPerMonth, taxPercent, product);


    }
}
