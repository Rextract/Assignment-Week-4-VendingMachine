package org.example;

import java.util.List;

public interface VendingMachine {

    String REPORT_HEADER = "Report for product sales: ";

    String examine();
    String use();

    static void printReports(List<VendingMachine> products){
        for (VendingMachine product : products){
            System.out.println(product.getReport());
        }
    }



    default String items(){
        return examine() + use();
    }

    default String getReport(){
        return REPORT_HEADER +
                this.examine() + "\n" +
                this.use() + "\n" +
                this.items() + "\n";
    }




    int addCurrency(int amount);

    Product request(int productNumber);

    int endSession();

    String getDescription(int productNumber);

    int getBalance();

    String[] getProducts();

}
