package org.example;

public class Drinks extends Product {

    private String name;
    private int price;
    private int calories;
    private String allergens;

    public Drinks(String name, int price, int calories, String allergens) {
        super(name, price, calories, calories, allergens);
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.allergens = allergens;
    }

    @Override
    protected void examine() {

    }

    @Override
    protected void use() {

    }
}
