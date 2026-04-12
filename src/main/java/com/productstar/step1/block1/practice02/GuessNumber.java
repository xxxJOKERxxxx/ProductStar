package com.productstar.step1.block1.practice02;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();// Создаём объект Random для генерации случайных чисел
        // random — имя переменной, new Random() — создаём новый объект
        int numberToGuess = random.nextInt(100) + 1;  // Генерируем случайное число от 1 до 100
        // random.nextInt(100) — возвращает число от 0 до 99
        // + 1 — сдвигаем на 1, получается от 1 до 100// число от 1 до 100
        Scanner scanner = new Scanner(System.in);// Создаём объект Scanner для чтения ввода с клавиатуры
        // System.in — стандартный поток ввода (клавиатура)

        while (true) {// while (true) — бесконечный цикл
            // Выход из него будет через break, когда угадаем число
            System.out.print("Введите число: ");  // Выводим приглашение на экран
            // System.out.print — печатает без перевода строки
            int userGuess = scanner.nextInt(); // Читаем целое число, которое ввёл пользователь
            // scanner.nextInt() — ждёт ввод числа и нажатия Enter

            if (userGuess == numberToGuess) {// Если введённое число равно загаданному
                // == — сравнение на равенство
                System.out.println("Угадал!");
                break;  // выходим из цикла
            } else if (userGuess < numberToGuess) {// Иначе (введённое число больше загаданного)
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }

        scanner.close();
    }
}
