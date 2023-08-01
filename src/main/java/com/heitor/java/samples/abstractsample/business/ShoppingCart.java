package com.heitor.java.samples.abstractsample.business;

import com.heitor.java.samples.abstractsample.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    private DiscountStrategy discountStrategy;

    public ShoppingCart() {
        discountStrategy = new NoDiscountStrategy();
    }
    public void addProduct(Product product) {
        products.add(product);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotalPrice() {
        double totalPrice = products.stream().mapToDouble(Product::calculateDiscountedPrice).sum();
        return discountStrategy.applyDiscount(totalPrice);
    }
}