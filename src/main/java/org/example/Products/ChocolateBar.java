package org.example.Products;

import org.example.models.VendingMachine;

public class ChocolateBar extends Product {

    private String productName;
    private int salePrice;
    private int chocolateBar;
    private int cost;


    public ChocolateBar(String productName, int sellPrice, int buyPrice, int amount,
                        int salePrice, int chocolateBar, int cost) {

        super(productName, sellPrice, buyPrice, amount);
        this.productName = productName;
        this.salePrice = salePrice;
        this.chocolateBar = chocolateBar;
        this.cost = cost;
    }

    @Override
    public void addCurrency(int amount) {

    }

    @Override
    public int request(int productNumber) {
        return Integer.parseInt(getDescription(1));
    }

    @Override
    public int endSession() {
        return salePrice * cost;
    }

    @Override
    public String getDescription(int productNumber) {
        return getDescription(productNumber);
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
