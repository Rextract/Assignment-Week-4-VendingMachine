package org.example.Products;

import org.example.models.VendingMachine;

public class Product implements VendingMachine {





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
