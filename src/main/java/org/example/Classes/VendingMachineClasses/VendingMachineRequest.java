package org.example.Classes.VendingMachineClasses;

import org.example.Classes.DepositMoneyPool.moneyPool;
import org.example.INTERFACES.Product;

public class VendingMachineRequest {

    public Product product;
    public moneyPool addCurrency;


    public VendingMachineRequest(int request, int...addCurrency) {
        this.product = Product.valueOf(request);
        this.addCurrency = new moneyPool(addCurrency);


    }

}