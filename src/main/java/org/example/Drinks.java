package org.example;

public class Drinks implements VendingMachine {

    private String name;
    private int price;
    private int calories;
    private String allergens;

    public Drinks(String name, int price, int calories, String allergens) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.allergens = allergens;
    }

    @Override
    public void addCurrency(int amount) {

    }

    @Override
    public Product request(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
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
