package com.heitor.java.samples.abstractsample.model;

public class ElectronicsProduct extends Product {
    public ElectronicsProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice() * 0.95; // 5% discount on electronics products
    }
}
