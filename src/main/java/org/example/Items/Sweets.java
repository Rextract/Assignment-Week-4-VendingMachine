package org.example.Items;

import org.example.Product;

public class Sweets extends Product {

    private int price = 20;
    private String name = "Gott&Blandat";
    private int calories = 100;
    private String allergens = "Has gelatin";




    public Sweets(int price, String name, int calories, String allergens) {
        super(price, name, calories, allergens);
        this.price = price;
        setName(name);
        setCalories(calories);
        setAllergens(allergens);

    }


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String getAllergens() {
        return allergens;
    }

    @Override
    public void setAllergens(String allergens) {
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
    public int addCurrency(int amount) {
        return 0;
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
