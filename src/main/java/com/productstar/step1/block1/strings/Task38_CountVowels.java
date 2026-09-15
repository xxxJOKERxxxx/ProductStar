package com.productstar.step1.block1.strings;

public class Task38_CountVowels {
    public static void main(String[] args) {
        String text = "Hello Java!";
       int result =  countVowels(text);
        System.out.println(result);
    }
    public static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
