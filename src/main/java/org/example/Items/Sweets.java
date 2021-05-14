package org.example.Items;

import org.example.Product;

public class Sweets extends Product {

    private int price;
    private String name;
    private int calories;
    private String allergens;

    public Sweets(int price, String name, int calories, String allergens) {
        super(price, name, calories, allergens);
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }

}
