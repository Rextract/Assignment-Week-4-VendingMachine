package org.example;

import java.util.List;

public interface VendingMachine {

    String REPORT_HEADER = "Report for the sales item: ";

    String examine();
    String use();


    static void printReports(List<VendingMachine> products){
        for (VendingMachine product : products){
            System.out.println(Product.class);
        }
    }

    default String getReport(){
        return REPORT_HEADER ;
    }



    int addCurrency(int amount);

    Product request(int productNumber);

    int endSession();

    String getDescription(int productNumber);

    int getBalance();

    String[] getProducts();

}
