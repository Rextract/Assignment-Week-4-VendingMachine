package org.example.models;

public abstract class VendingMachine {

    private int price;
    private String name;
    private int calories;
    private String allergens;

    public VendingMachine(int price, String name, int calories, String allergens) {
        this.price = price;
        setName(name);
        setCalories(calories);
        setAllergens(allergens);
    }

    String examine(int price, String name, double calories, String allergens){
        return examine(25, "ChocolateBar", 8, "Beware could be Peanuts");
    }

    String use(){
        return use();
    }




    public String getPrice(int price) {
        return String.valueOf(this.price);
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
