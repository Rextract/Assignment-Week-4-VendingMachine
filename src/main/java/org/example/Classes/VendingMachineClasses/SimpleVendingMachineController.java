package org.example.Classes.VendingMachineClasses;

import org.example.Classes.DepositMoneyPool.SimpleCalculator;
import org.example.Classes.DepositMoneyPool.moneyPool;
import org.example.INTERFACES.Calculator;
import org.example.INTERFACES.VendingMachineControl;

public class SimpleVendingMachineController  implements VendingMachineControl {

    private Calculator calculator = new SimpleCalculator();

    @Override
    public moneyPool calculateChange(VendingMachineRequest request) {
        return null;
    }
}
