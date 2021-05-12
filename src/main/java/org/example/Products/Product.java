package org.example.Products;

import org.example.models.VendingMachine;

public class Product implements VendingMachine {

    private String productName;
    private int sellPrice;
    private int buyPrice;
    private int amount

    public Product(String productName, int sellPrice, int buyPrice, int amount) {
        this.productName = productName;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.amount = amount;
    }

    @Override
    public void addCurrency(int amount) {

    }

    @Override
    public org.example.models.Product request(int productNumber) {
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
