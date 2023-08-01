package com.heitor.java.samples.abstractsample;

import com.heitor.java.samples.abstractsample.business.NoDiscountStrategy;
import com.heitor.java.samples.abstractsample.business.TenPercentDiscountStrategy;
import com.heitor.java.samples.abstractsample.model.ClothingProduct;
import com.heitor.java.samples.abstractsample.model.ElectronicsProduct;
import com.heitor.java.samples.abstractsample.model.Product;
import com.heitor.java.samples.abstractsample.business.ShoppingCart;

public class SampleAbstract {
    void execute(){
        ShoppingCart cart = new ShoppingCart();

        Product laptop = new ElectronicsProduct("Laptop", 1000);
        Product tshirt = new ClothingProduct("T-Shirt", 20);

        cart.addProduct(laptop);
        cart.addProduct(tshirt);

        // Apply 10% discount for a total cart value above 1000
        if (cart.calculateTotalPrice() > 1000) {
            cart.setDiscountStrategy(new TenPercentDiscountStrategy());
        } else {
            cart.setDiscountStrategy(new NoDiscountStrategy());
        }

        double totalCost = cart.calculateTotalPrice();
        System.out.println("Total cost after discounts: $" + totalCost);
    }

}
