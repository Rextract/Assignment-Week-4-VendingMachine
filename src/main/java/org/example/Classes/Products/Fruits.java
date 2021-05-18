package org.example.Classes.Products;

import org.example.INTERFACES.Product;

public class Fruits implements Product {

    public int price;
    public String name;
    public int calories;
    public String allergens;
    public int [] productNumber;

    public Fruits(int price, String name, int calories, String allergens,
                  int[] productNumber) {
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
        this.productNumber = productNumber;
    }


    @Override
    public void examine() {
        int price = 15;
        String name = "Banana";
        int calories = 100;
        String allergens = "It's a banana.....";
        int productNumber = 0;
        System.out.println(price + name + calories + allergens + productNumber);
    }

    @Override
    public void use() {
        System.out.println("Good for you being healthy");

    }
}
