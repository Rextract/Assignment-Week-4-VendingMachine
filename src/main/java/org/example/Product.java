package org.example;

public abstract class Product implements VendingMachine {

    private int price;
    private String name;
    private int calories;
    private String allergens;

    public Product(int price, String name, int calories, String allergens) {
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }


}

