package org.example.Classes;

import org.example.INTERFACES.VendingMachineControl;

public class VendingMachineRequest {

    public Product product;
    public VendingMachineControl addCurrency;


    public VendingMachineRequest(int request, int... addCurrency) {
        this.product = Product.valueOf(request);
        this.addCurrency = new VendingMachineControl(addCurrency);


    }

}