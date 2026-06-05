package com.productstar.step1.block1.Exception;

public class ExceptionsMain {

    public static String name;

    public static void main(String[] args) {

        try {
            name.length();
            Integer.parseInt("aaaaaaa");
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero! Sin!");
        } catch (NumberFormatException e) {
            System.out.println("Please specify correct number!");
        } catch (Exception e) {
            System.out.println("Unknown exception!");
        }

        System.out.println("All OK!");
    }

    public static int divideByZero() {
        return 666 / 0;
    }
}
