package org.example.Products;

import org.example.models.VendingMachine;

public class Product implements VendingMachine {

    private String productName;
    private int sellPrice;
    private int buyPrice;
    private int amount;

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
    public int request(int productNumber) {
        return productNumber;
    }

    @Override
    public int endSession() {
        return endSession();
    }

    @Override
    public String getDescription(int productNumber) {
        return getDescription(productNumber);
    }

    @Override
    public int getBalance() {
        return getBalance();
    }

    @Override
    public String[] getProducts() {
        return getProducts();
    }
}
