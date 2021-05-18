package org.example.Classes.Products;

import org.example.INTERFACES.Product;

public class Drinks implements Product {

    public int price;
    public String name;
    public int calories;
    public String allergens;
    public int[] productNumber;

    public Drinks(int price, String name, int calories, String allergens,
                  int[] productNumber) {
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
        this.productNumber = productNumber;
    }

    @Override
    public void examine() {
        int price = 25;
        String name = "Lemonade";
        int calories = 100;
        String allergens = "Traces of lemon";
        int productNumber = 1;
        System.out.println(price + name + calories + allergens + productNumber);
    }

    @Override
    public void use() {
        System.out.println("Served cold");
    }







}
