package com.heitor.java.samples.abstractsample.business;

public class TenPercentDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.9; // 10% discount
    }
}