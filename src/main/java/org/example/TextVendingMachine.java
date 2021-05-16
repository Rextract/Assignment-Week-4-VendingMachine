package org.example;

import org.example.INTERFACES.VendingMachine;
import org.example.INTERFACES.VendingMachineControl;

public class TextVendingMachine implements VendingMachine {

    private VendingMachineControl control = new SimpleVendingMachineController();
    private int selectedProduct;
    private CoinBundle change;



    @Override
    public void addCurrency(int amount) {
        System.out.println("Welcome to the Vending Machine");
        for (Product product: Product.values)

    }

    @Override
    public Product request(int productNumber) {
        return null;
    }

    @Override
    public int endSessions() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
