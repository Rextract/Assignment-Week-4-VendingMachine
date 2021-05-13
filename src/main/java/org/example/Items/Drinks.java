package org.example.Items;

import org.example.Inventory;
import org.example.Product;
import org.example.VendingMachine;

public class Drinks implements VendingMachine{

    private int price;
    private String name;
    private int calories;
    private String allergens;

    public Drinks(int price, String name, int calories, String allergens) {
        super();??
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }

    @Override
    public String examine() {
        return null;
    }

    @Override
    public String use() {
        return null;
    }

    @Override
    public int addCurrency(int amount) {
        return 0;
    }

    @Override
    public Product request(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
