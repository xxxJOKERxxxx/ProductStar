package com.productstar.step1.block1.strings;

public class Task37_PrintEachChar {
    public static void main(String[] args) {
        String text = "Hello-World";
        // Здесь будешь вызывать метод
        printEachChar(text);
    }

    public static void printEachChar(String text) {
        // Твой код здесь
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
