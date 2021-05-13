package org.example;

public abstract class Product {

    private String examine;
    private int price;
    private int calories;
    private String allergens;


    public Product(String examine, int price, int calories, String allergens) {
        this.examine = examine;
        this.price = price;
        this.calories = calories;
        this.allergens = allergens;
    }



    protected abstract void examine();

    protected abstract void use();


}
