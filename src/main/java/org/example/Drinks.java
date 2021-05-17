package org.example;

public class Drinks implements Product {

    private int price;
    private String name;
    private int calories;
    private String allergens;

    public Drinks(int price, String name, int calories, String allergens) {
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }

    @Override
    public String examine(int price, String name, int calories, String allergens) {
        return examine(25, " Lemonade ", 100, " Traces of lemon ");
    }

    @Override
    public String use() {
        return name;
    }
}
