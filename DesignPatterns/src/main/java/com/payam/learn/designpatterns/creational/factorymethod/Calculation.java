package com.payam.learn.designpatterns.creational.factorymethod;

public abstract class Calculation {

    protected long amountPerMonth;
    protected long taxPercent;
    protected String product;

    public Calculation(long amountPerMonth, long taxPercent, String product) {
        this.amountPerMonth = amountPerMonth;
        this.taxPercent = taxPercent;
        this.product = product;
    }


    public abstract Long calculate();
}
