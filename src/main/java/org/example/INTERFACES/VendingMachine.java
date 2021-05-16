package org.example.INTERFACES;

public interface VendingMachine {

    void addCurrency(int amount);

    Product request(int productNumber);

    int endSessions();

    String getDescription(int productNumber);

    int getBalance();

    String [] getProducts();

}
