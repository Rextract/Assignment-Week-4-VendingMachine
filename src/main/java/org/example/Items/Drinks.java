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
}
