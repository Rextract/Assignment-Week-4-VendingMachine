package org.example;

public abstract class Product {

    protected int price;
    protected String name;
    protected int calories;
    protected String allergens;

    public Product(int price, String name, int calories, String allergens) {
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
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
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", allergens='" + allergens + '\'' +
                '}';
    }
}

