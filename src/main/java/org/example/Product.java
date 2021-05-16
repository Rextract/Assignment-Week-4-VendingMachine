package org.example;

public abstract class Product {

    abstract String examine();
    abstract String use();


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

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getCalories() {
        return this.calories;
    }

    public String getAllergens() {
        return this.allergens;
    }
}
