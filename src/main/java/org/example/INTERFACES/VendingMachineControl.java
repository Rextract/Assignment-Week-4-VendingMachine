package org.example.INTERFACES;

import org.example.Classes.VendingMachineClasses.VendingMachineRequest;
import org.example.Classes.DepositMoneyPool.moneyPool;

public interface VendingMachineControl {

    moneyPool calculateChange(VendingMachineRequest request);

}
