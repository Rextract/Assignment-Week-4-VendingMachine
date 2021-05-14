package org.example;

import java.util.List;

public interface VendingMachine {

    void addCurrency(int amount);

    Product request(int productNumber);

    int endSession();

    String getDescription();

    int getBalance();

    String[] getProducts();





}
