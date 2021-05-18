package org.example.INTERFACES;

import org.example.Classes.VendingMachineRequest;
import org.example.Classes.moneyPool;

public interface VendingMachineControl {

    moneyPool calculateChange(VendingMachineRequest request);

}
