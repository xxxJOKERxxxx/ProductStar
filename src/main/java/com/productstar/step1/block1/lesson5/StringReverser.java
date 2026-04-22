// Объявляем пакет (путь к папке)
package com.productstar.step1.block1.lesson5;

// Импортируем готовый класс Stack из Java
// Stack — это реализация стека (LIFO)
import java.util.Stack;

// Объявляем публичный класс StringReverser
// public — доступен отовсюду
// class — объявление класса
// StringReverser — имя класса
public class StringReverser {

    /**
     * Метод, который переворачивает строку с помощью стека
     *
     * @param input — исходная строка (например "hello")
     * @return — перевёрнутая строка (например "olleh")
     */
    public static String reverseString(String input) {

        // ШАГ 1: Создаём стек для хранения символов
        // Stack<Character> — стек, который хранит символы (char)
        // stack — имя переменной
        // new Stack<>() — создаём новый пустой стек
        // <> — "алмазный оператор" (Java сам понимает тип)
        Stack<Character> stack = new Stack<>();

        // ШАГ 2: Кладём каждый символ строки в стек
        // input.toCharArray() — превращает строку в массив символов ['h','e','l','l','o']
        // for (char ch : ...) — улучшенный цикл (для каждого символа)
        for (char ch : input.toCharArray()) {
            // stack.push(ch) — кладём символ на ВЕРХ стека
            // push — операция "положить" в стек
            stack.push(ch);
        }

        // ШАГ 3: Создаём StringBuilder для сборки результата
        // StringBuilder — специальный класс для построения строк
        // Он быстрее, чем склеивать строки через +
        StringBuilder reversed = new StringBuilder();

        // ШАГ 4: Достаём символы из стека (с верхушки)
        // stack.isEmpty() — проверяет, пуст ли стек
        // while (!stack.isEmpty()) — пока стек НЕ пуст
        while (!stack.isEmpty()) {
            // stack.pop() — снимает символ с верхушки и возвращает его
            // reversed.append(...) — добавляет этот символ в результат
            // pop — операция "снять" со стека (удаляет элемент)
            reversed.append(stack.pop());
        }

        // ШАГ 5: Возвращаем результат
        // reversed.toString() — превращает StringBuilder в обычную строку
        return reversed.toString();
    }

    // Точка входа в программу (для теста)
    public static void main(String[] args) {
        // Исходная строка
        String input = "hello";

        // Вызываем наш метод и сохраняем результат
        String output = reverseString(input);

        // Выводим результат на экран
        System.out.println("Original string: " + input);   // hello
        System.out.println("Reversed string: " + output);  // olleh
    }
}
