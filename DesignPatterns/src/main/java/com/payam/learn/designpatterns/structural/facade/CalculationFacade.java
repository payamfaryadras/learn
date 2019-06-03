package com.payam.learn.designpatterns.structural.facade;

public class CalculationFacade {
    private BasePremiumCalculationService basePremiumCalculationService;
    private TaxCalculationService taxCalculationService;
    private DiscountPremiumCalculationService discountPremiumCalculationService;

    public CalculationFacade() {
        this.basePremiumCalculationService = new BasePremiumCalculationService();
        this.taxCalculationService = new TaxCalculationService();
        this.discountPremiumCalculationService = new DiscountPremiumCalculationService();
    }

    public double calaculation(Object object) {
        return basePremiumCalculationService.calculation(object) +
                taxCalculationService.calculation(object) -
                discountPremiumCalculationService.calculation(object);

    }
}
