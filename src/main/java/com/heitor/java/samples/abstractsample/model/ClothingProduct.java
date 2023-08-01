package com.heitor.java.samples.abstractsample.model;

public class ClothingProduct extends Product {
    public ClothingProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscountedPrice() {
        // Clothing products have no discount
        return getPrice();
    }
}