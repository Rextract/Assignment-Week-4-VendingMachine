package org.example;

import java.util.List;

public interface VendingMachine {

    public int price ();
    public String name();
    public int calories();
    public String allergens();







    int addCurrency(int amount);

    Product request(int productNumber);

    int endSession();

    String getDescription(int productNumber);

    int getBalance();

    String[] getProducts();

}
