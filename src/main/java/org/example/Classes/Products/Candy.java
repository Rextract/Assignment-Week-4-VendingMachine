package org.example.Classes.Products;

import org.example.INTERFACES.Product;

public class Candy implements Product {

    public int price;
    public String name;
    public int calories;
    public String allergens;
    public int[] productNumber;


    public Candy(int price, String name, int calories, String allergens,
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
        String name = "Marabou MilkChocolate";
        int calories = 500;
        String allergens = "Traces of nuts";
        int productNumber = 2;
        System.out.println(price + name + calories + allergens + productNumber);
    }

    @Override
    public void use() {
        System.out.println("Here's a nice piece of chocolate");
    }
}
