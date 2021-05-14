package org.example;

public abstract class Product implements VendingMachine{


    protected int price;
    protected String name;
    protected int calories;
    protected String allergens;

    public Product(int price, String name, int calories, String allergens) {
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }

    @Override
    public String examine() {
        return examine();
    }

    @Override
    public String use() {
        return use();
    }
}

