package org.example;

import java.util.List;

public interface VendingMachine {


    //abstract String examine(int price, String name, int calories, String allergens);
    //abstract String use();

    void addCurrency(int amount);

    Product request(int productNumber);

    int endSession();

    String getDescription();

    int getBalance();

    String[] getProducts();





}
