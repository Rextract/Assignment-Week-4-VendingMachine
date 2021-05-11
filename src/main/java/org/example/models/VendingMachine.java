package org.example.models;

public abstract class VendingMachine {

    private int price;
    private String name;
    private double calories;
    private String allergens;

    public VendingMachine(int price, String name, double calories, String allergens) {
        this.price = price;
        setName(name);
        setCalories(calories);
        setAllergens(allergens);
    }

    String examine(){
        return examine();
    }

    String use(){
        return use();
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

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }
}
