package org.example;

import java.util.List;

public interface VendingMachine {

    String REPORT_HEADER = "Report for Sales item: ";



    void addCurrency (int amount);

    Product request (int productNumber);

    int endSession();

    String getDescription (int productNumber);

    int getBalance();

    String [] getProducts();


    static void printReports(List<Product> products){
        for (Product product : products){
            System.out.println(product.examine());
        }
    }






}
