package org.example;

public abstract class Product {



    public Product(String examine, int price, int calories, int i, String use) {
        this.examine();
        this.use();


    }

    protected abstract void examine();

    protected abstract void use();


}
