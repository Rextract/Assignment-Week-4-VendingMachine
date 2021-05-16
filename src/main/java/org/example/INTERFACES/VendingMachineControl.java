package org.example.INTERFACES;

import org.example.Product;

public interface VendingMachineControl {

    CoinBundle calculateChange (VendingMachineRequest request);

}

public class VendingMachineRequest {

    public Product product;
    public CoinBundle enteredCoins;

    public VendingMachineRequest(int product, int enteredCoins) {
        this.product = null;
        this.enteredCoins = new CoinBundle(enteredCoins);
    }


}
