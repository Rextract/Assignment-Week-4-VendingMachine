package org.example.INTERFACES;

import org.example.Product;

public interface VendingMachine {



    void addCurrency(int amount);

    Product request(int productNumber);

    int endSessions();

    String getDescription(int productNumber);

    int getBalance();

    String [] getProducts();

}
