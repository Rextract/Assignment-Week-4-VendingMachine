package org.example;

public abstract class Product {

    private int price;
    private String name;
    private int calories;
    private String allergens;

    public Product(int price, int name, int calories, String allergens) {
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }

    abstract String examine();

    abstract String use();

}
