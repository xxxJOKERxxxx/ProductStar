package com.productstar.step1.block1.practice01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Площадь прямоугольника
        System.out.println("=== Задача 1: Площадь прямоугольника ===");
        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Площадь прямоугольника: " + area);
        System.out.println(); // Пустая строка для разделения

        // Задача 2: Конвертация температуры
        System.out.println("=== Задача 2: Конвертация температуры ===");
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        System.out.println("Температура в градусах Фаренгейта: " + fahrenheit);
        System.out.println();

        // Задача 3: Перевод времени
        System.out.println("=== Задача 3: Перевод времени из минут в часы и минуты ===");
        System.out.print("Введите количество минут: ");
        int totalMinutes = scanner.nextInt();

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println("Это равно: " + hours + " часов " + minutes + " минут");

        scanner.close();
    }
}
