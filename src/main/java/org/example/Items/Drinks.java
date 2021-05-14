package org.example.Items;

import org.example.Product;

public class Drinks extends Product {

    private int price = 25;
    private String name = "Lemonade";
    private int calories = 87;
    private String allergens = "Traces of lemon";


    public Drinks(int price, String name, int calories, String allergens) {
        super(price, name, calories, allergens);
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }

    @Override
    public String items() {
        return super.items();
    }

    @Override
    public String getReport() {
        return super.getReport();
    }

    @Override
    public int addCurrency(int amount) {
        return amount * price;
    }

    @Override
    public Product request(int productNumber) {
        return request(productNumber);
    }

    @Override
    public int endSession() {
        return endSession();
    }

    @Override
    public String getDescription(int productNumber) {
        return getDescription(productNumber);
    }

    @Override
    public int getBalance() {
        return getBalance();
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
