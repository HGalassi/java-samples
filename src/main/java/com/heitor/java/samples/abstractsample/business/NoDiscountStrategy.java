package com.heitor.java.samples.abstractsample.business;

public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice;
    }
}
