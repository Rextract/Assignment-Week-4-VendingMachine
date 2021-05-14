package org.example;

public abstract class Product {

    protected int price;
    protected String name;
    protected int calories;
    protected String allergens;

    public Product(int price, String name, int calories, String allergens) {
        this.price = price;
        setName(name);
        setCalories(calories);
        setAllergens(allergens);
    }



    public int getPrice() {
        return price;
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
}

