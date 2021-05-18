package org.example.INTERFACES;

import java.util.List;

public interface Product {

    Product getProduct(int price, String name, int calories, String allergens);
    List<Product> getProducts();

    String examine();
    String use();

}
