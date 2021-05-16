package org.example;

public class productDrinks implements Product, VendingMachine {

    public int price = 25;
    public String name = "Lemonade";
    public int calories = 120;
    public String allergens = "Traces of Lemons";

    public productDrinks(int price, String name, int calories, String allergens) {
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }

    @Override
    public String examine() {
        return null;
    }

    @Override
    public String use() {
        return null;
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
