package org.example.Products;

import org.example.Product;

public class Drinks implements Product{

    private int price;
    private String name;
    private int calories;
    private String allergens;

    public Drinks(int price, String name, int calories, String allergens) {
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setPrice(int price) {
        setPrice(25);
        this.price = price;
    }


    public void setName(String name) {
        setName("Lemonade");
        this.name = name;
    }


    public void setCalories(int calories) {
        setCalories(110);
        this.calories = calories;
    }


    public void setAllergens(String allergens) {
        setAllergens("Traces of Lemons");
        this.allergens = allergens;
    }



    @Override
    public String examine(int price, String name, int calories, String allergens) {
        return examine(price, name, calories, allergens);
    }

    @Override
    public String use() {
        return use();
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", allergens='" + allergens + '\'' +
                ", use='" + use() + '\'' +
                '}';
    }
}
