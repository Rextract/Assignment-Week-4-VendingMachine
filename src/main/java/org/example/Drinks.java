package org.example;

public class Drinks implements Product {

    private int price = 25;
    private String name = "Lemonade";
    private int calories = 120;
    private String allergens = "Traces of Lemons";

    public Drinks(int price, String name, int calories, String allergens) {
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
