package org.example.INTERFACES;

public interface VendingMachine {


    void addCurrency(int amount);

    Product request (int productNumber);

    int endSession();

    String getDescription (int productNumber);

    int getBalance();

    String [] getProducts(int i);

}
