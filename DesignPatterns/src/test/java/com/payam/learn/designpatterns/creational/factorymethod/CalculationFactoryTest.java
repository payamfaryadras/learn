package com.payam.learn.designpatterns.creational.factorymethod;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationFactoryTest {


    @Test
    public void createCalculator_that_calculate_by_calculation1_method() {
        Calculation c1 = CalculationFactory.createCalculator(100l,10l,"c1",true);
        long realResult =c1.calculate();
        long expected =100l*10l+200;
        Assert.assertEquals(expected,realResult);

    }
    @Test
    public void createCalculator_that_calculate_by_calculation2_method() {
        Calculation c2 = CalculationFactory.createCalculator(100l,10l,"c1",false);
        long realResult =c2.calculate();
        long expected =100l*10l+100;
        Assert.assertEquals(expected,realResult);

    }


}