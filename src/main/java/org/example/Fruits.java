package org.example;

public class Fruits implements Product {

    private int price = 15;
    private String name = "Big Apple";
    private int calories = 125;
    private String allergens = "Has traces of Apple";

    public Fruits(int price, String name, int calories, String allergens) {
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }

    @Override
    public String examine() {
        return price + name + calories + allergens;
    }

    @Override
    public String use() {
        return name;
    }
}
