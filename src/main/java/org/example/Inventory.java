package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Inventory implements VendingMachine{

    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addCurrency(Product product){
        product.add(product);
    }




}
