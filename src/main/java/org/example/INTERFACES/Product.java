package org.example.INTERFACES;



public interface Product {

    String REPORT_HEADER = "Report for Sales Products";


    public static Product valueOf(int numberSelection) {
        for (Product product : Product.values()) {
            System.out.println(product.getReport());
        }
    }


    static Product[] values() {
        return new Product[0];
    }

    void examine();

    void use();

    default String getReport(){
        return REPORT_HEADER;
    }


}




