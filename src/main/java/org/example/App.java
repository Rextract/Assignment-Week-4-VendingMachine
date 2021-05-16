package org.example;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Scanner SCANNER = new Scanner(System.in);

        VendingMachineInterface machineInterface = null;

        machineInterface.displayProducts();

        String selectedProduct = SCANNER.nextLine();

        machineInterface.selectProduct(Integer.parseInt(selectedProduct));


        machineInterface.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();
        int[] enteredCoins = {};
        machineInterface.enterCoins(enteredCoins);

        machineInterface.displayChangeMessage();


    }


}

