package com.productstar.step1.block1.Exception;

public class ExceptionsMain {

    public static void main(String[] args) {

        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero! Sin!");
        }

    }

    public static int divideByZero() {
        return 666/0;
    }
}
