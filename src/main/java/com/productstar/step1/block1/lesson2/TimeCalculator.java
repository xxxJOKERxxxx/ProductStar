package com.productstar.step1.block1.lesson2;

public class TimeCalculator {
    public static void main(String[] args) {
        int totalMinutes =150;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        System.out.println(totalMinutes + " минут = " + hours + " часа " + minutes + " минут");
    }
}
