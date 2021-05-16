package org.example;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public interface Calculator {

    int addition (int num1, int num2);
    int subtraction (int num1, int num2);

    Scanner SCANNER = new Scanner(System.in);

    static String getString(){
        return SCANNER.nextLine().trim();
    }

    static int getInt() throws NumberFormatException {
        return parseInt(getString().replace(',', ','));
    }

    default int calculate (int num1, int num2, String operation){
        switch(operation.toUpperCase()){
            case "+":
                return addition(num1, num2);
            case "-":
                return subtraction(num1, num2);

            default:
                throw new IllegalArgumentException(operation + " is not a valid input");
        }
    }

}
