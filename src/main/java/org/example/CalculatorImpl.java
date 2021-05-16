package org.example;

public class CalculatorImpl implements Calculator {


    @Override
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int calculate(int num1, int num2, String operation) {
        return Calculator.super.calculate(num1, num2, operation);
    }
}
