package org.example;

public class Drinks extends Product {

    private String name;
    private int price;
    private int calories;
    private String allergens;

    public Drinks(String examine, int price, int calories, String allergens) {
        super(examine, price, calories, allergens);
    }


    @Override
    protected void examine() {
        String name = this.name;
        int price = this.price;
        int calories = this.calories;
        String allergens = this.allergens;

    }

    @Override
    protected void use() {

    }
}
