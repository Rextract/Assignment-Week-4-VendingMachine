package org.example;

public class Product implements VendingMachine {

    private int price;
    private String name;
    private int calories;
    private String allergens;


    public Product(int price, String name, int calories, String allergens) {
        setPrice(price);
        setName(name);
        setCalories(calories);
        setAllergens(allergens);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }



    @Override
    public String examine(int price, String name, int calories, String allergens) {
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
    public String getDescription() {
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

