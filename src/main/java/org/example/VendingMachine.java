package org.example;

import java.util.List;

public interface VendingMachine {



    String examine();
    String use();









    int addCurrency(int amount);

    Product request(int productNumber);

    int endSession();

    String getDescription(int productNumber);

    int getBalance();

    String[] getProducts();

}
