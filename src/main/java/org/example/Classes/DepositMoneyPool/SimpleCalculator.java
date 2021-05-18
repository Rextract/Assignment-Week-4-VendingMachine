package org.example.Classes.DepositMoneyPool;

import org.example.ENUM.Coins;
import org.example.INTERFACES.Calculator;

public class SimpleCalculator implements Calculator {


    private moneyPool change;

    @Override
    public int calculateTotal(moneyPool addCurrency) {
        return addCurrency.getTotal();
    }

    @Override
    public moneyPool calculateChange(int amountMoneyToReturn) {
         moneyPool change = new moneyPool(new int [10]);

         int remainingAmount = amountMoneyToReturn;
         change.number1KR = remainingAmount / Coins.ONE_SEK.getValue();
         remainingAmount = remainingAmount % Coins.ONE_SEK.getValue();

        change.number2KR = remainingAmount / Coins.TWO_SEK.getValue();
        remainingAmount = remainingAmount % Coins.TWO_SEK.getValue();

        change.number5KR = remainingAmount / Coins.FIVE_SEK.getValue();
        remainingAmount = remainingAmount % Coins.FIVE_SEK.getValue();

        change.number10KR = remainingAmount / Coins.TEN_SEK.getValue();
        remainingAmount = remainingAmount % Coins.TEN_SEK.getValue();

        change.number20KR = remainingAmount / Coins.TWENTY_SEK.getValue();
        remainingAmount = remainingAmount % Coins.TWENTY_SEK.getValue();

        change.number50KR = remainingAmount / Coins.FIFTY_SEK.getValue();
        remainingAmount = remainingAmount % Coins.FIFTY_SEK.getValue();

        change.number100KR = remainingAmount / Coins.ONE_HUNDRED_SEK.getValue();
        remainingAmount = remainingAmount % Coins.ONE_HUNDRED_SEK.getValue();

        change.number200KR = remainingAmount / Coins.TWO_HUNDRED_SEK.getValue();
        remainingAmount = remainingAmount % Coins.TWO_HUNDRED_SEK.getValue();

        change.number500KR = remainingAmount / Coins.FIVE_HUNDRED_SEK.getValue();
        remainingAmount = remainingAmount % Coins.FIVE_HUNDRED_SEK.getValue();

        change.number1000KR = remainingAmount / Coins.ONE_THOUSAND_SEK.getValue();
        remainingAmount = remainingAmount % Coins.ONE_THOUSAND_SEK.getValue();

        return change;


    }
}
