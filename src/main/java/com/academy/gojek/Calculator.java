package com.academy.gojek;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        char operation = '+';

        int result = 0;
        switch (operation) {
            case '+': {
                result = num1 + num2;
            }
            break;
            case '-': {
                result = num1 - num2;
            }
            break;
            case '/': {
                result = num1 / num2;
            }
            break;
            case '*': {
                result = num1 * num2;
            }
            break;
            default:
                throw new UnsupportedOperationException("unsupported operation");
        }

        System.out.println("result = " + result);
    }
}
