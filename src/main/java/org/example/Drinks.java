package org.example;

public class Drinks extends Product {

    private String name;
    private int price;
    private int calories;
    private String allergens;

    public Drinks(int examine, int price, int calories, String allergens, String name) {
        super(examine, price, calories, allergens);
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.allergens = allergens;
    }





    @Override
    protected String examine() {
       return String.valueOf(0);

    }

    @Override
    protected String use() {
        return null;
    }
}
