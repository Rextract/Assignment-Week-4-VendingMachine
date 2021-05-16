package org.example.INTERFACES;

public interface VendingMachineControl {

    depositPool calculateChange (VendingMachineRequest request);

}

public class VendingMachineRequest {

    public Product product;
    public depositPool addCurrency;

    public VendingMachineRequest(int product, int addCurrency) {
        this.product = null;
        this.addCurrency = new depositPool(addCurrency);
    }


}
