package org.example.Items;

import org.example.Product;

public class Food extends Product {

    private int price;
    private String name;
    private int calories;
    private String allergens;



    public Food(int price, String name, int calories, String allergens) {
        super(price, name, calories, allergens);
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;

    }

    @Override
    public int addCurrency(int amount) {
        return 55;
    }

    @Override
    public Product request(int productNumber) {
        return request(2);
    }

    @Override
    public int endSession() {
        return 55;
    }

    @Override
    public String getDescription(int productNumber) {
        return getDescription(2);
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
