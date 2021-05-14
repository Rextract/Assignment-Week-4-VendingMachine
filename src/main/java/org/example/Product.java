package org.example;

public abstract class Product {

    private int price;
    private String name;
    private int calories;
    private String allergens;

   abstract String examine(int price, String name, int calories, String allergens);
   abstract String use();


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
}

