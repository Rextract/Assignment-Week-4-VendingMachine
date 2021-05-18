package org.example.Classes;

import org.example.INTERFACES.Product;
import org.example.INTERFACES.VendingMachineControl;

public class VendingMachineRequest {

    public Product product;
    public moneyPool addCurrency;


    public VendingMachineRequest(int request, int...addCurrency) {
        this.product = Product.valueOf(request);
        this.addCurrency = new moneyPool(addCurrency);


    }

}