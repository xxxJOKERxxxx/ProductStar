package com.productstar.step1.block1.practice01;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.println("Ведите длину прямоугольника: ");
        double length = scaner.nextDouble();

        System.out.println("Введите ширину прямоугольника: ");
        double width = scaner.nextDouble();

        double area = (length * width);

        System.out.println("Площадь прямоугольника равна " + area);

        scaner.close();

    }
}
