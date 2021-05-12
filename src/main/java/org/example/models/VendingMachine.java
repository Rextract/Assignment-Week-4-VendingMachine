package org.example.models;

import java.util.List;

public interface VendingMachine {

    String REPORT_HEADER = "Sales items: ";

    void addCurrency(int amount);      //amount = add the deposit pool(moneypool)
    int request(int productNumber);        // productNumber = buys a product
    int endSession();                       // returns the change and resets the deposit pool
    String getDescription(int productNumber);    // view the product description
    int getBalance();                            //returns the deposit pool amount
    String[] getProducts();                   // returns all products names and product numbers

    static void printReports(List<VendingMachine> items){
        for (VendingMachine item : items){
            System.out.println(item.getReport());
        }
    }

    default String getReport(){
        return REPORT_HEADER + getProducts() + "\n" ;

    }

}
