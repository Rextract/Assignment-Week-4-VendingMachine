package org.example.Classes;

import org.example.Classes.DepositMoneyPool.moneyPool;
import org.example.Classes.VendingMachineClasses.VendingMachineRequest;
import org.example.INTERFACES.Product;
import org.example.INTERFACES.VendingMachine;
import org.example.INTERFACES.VendingMachineControl;
import org.example.Classes.VendingMachineClasses.SimpleVendingMachineController;

public class VendingMachineText implements VendingMachine {

    private VendingMachineControl control = new SimpleVendingMachineController();
    private int request;
    private moneyPool change;

    String[] getProducts = {"Candy", "Drinks", "Fruits"};




    @Override
    public void addCurrency(int amount) {
        VendingMachineRequest request = new VendingMachineRequest(amount,
    }

    @Override
    public Product request(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
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
        System.out.println(getProducts[0] + getProducts[1] + getProducts[2]);
        return new String[0];
    }
}
