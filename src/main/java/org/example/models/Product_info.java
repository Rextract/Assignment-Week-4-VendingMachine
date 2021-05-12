package org.example.models;

import org.example.Products.Product;

public abstract class Product_info implements VendingMachine{

    private int price;
    private String name;
    private int calories;
    private String allergens;

    public Product_info(int price, String name, int calories, String allergens) {
        this.price = price;
        setName(name);
        setCalories(calories);
        setAllergens(allergens);
    }

    String examine(int price, String name, double calories, String allergens){
        return examine(price, name, calories, allergens);
    }

    String use(){
        return use();
    }

    public String getPrice() {
        return String.valueOf(this.price);
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getName() {
        return String.valueOf(getName());
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
        return String.valueOf(allergens);
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

}


