package org.example;

public class Food implements Product, VendingMachine {

    private int price;
    private String name;
    private int calories;
    private String allergens;

    public Food(int price, String name, int calories, String allergens) {
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
