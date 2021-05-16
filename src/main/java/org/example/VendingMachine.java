package org.example;

import java.util.List;

public interface VendingMachine {



    String examine(int price, String name, int calories, String allergens);
    String use();

    void addCurrency(int amount);

    Product request(int productNumber);

    int endSession();

    String getDescription();

    int getBalance();

    String[] getProducts();





}
