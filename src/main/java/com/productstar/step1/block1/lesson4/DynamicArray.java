package com.productstar.step1.block1.lesson4;

import java.util.Arrays;

public class DynamicArray {
    static int max_size = 2;
    static int size = 0;
    static int[] data = new int[max_size];

    public static void main(String[] args) {
        System.out.println(isEmpty());
        add(1);
        System.out.println(isEmpty());
        add(2);
        add(3);
        System.out.println(indexof(2));
        System.out.println(indexof(3));
        System.out.println(indexof(4));
        add(4);
        add(5);
        remove(3);
        print();
    }
// что внутри массива
    static void print() {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" " + data[i]);
        }
        System.out.println("]");
    }
//получение данных из масива
    static void add(int value) {
        if (size >= max_size) {
           int[] temp = Arrays.copyOf(data, size);
           max_size *= 2;
           data = new int[max_size];
           for (int i = 0; i < temp.length; i++) {
               data[i] = temp[i];
           }
        }
        data[size] = value;
        size++;
    }
// проверка что массив не пуст
    static boolean isEmpty() {
        return size == 0;
    }
    //а если такой элемент в динамическом массиве?
    static boolean contains(int value) {
        return indexof(value) >=0;
    }
    //какова позиция элемента внутри динамического массива
    static int indexof(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }
// получение данных из массива
    static int get(int index) {
        if(index < 0 || index >= size) {
            throw new RuntimeException("Index out of bounds!");
        }
        return data[index];
    }
//удаление данных из массива
    static void remove(int index) {
        if(index < 0 || index >= size) {
    throw new RuntimeException("Index out of bounds!");
        }
        int[] temp = Arrays.copyOf(data,size);
        for (int i = index; i < temp.length -1; i++) {
            data[i] = temp[i+1];
        }
        data[temp.length-1] = 0;

    }
    static void clear() {
        // Создаём новый пустой массив такого же размера (или начального)
        data = new int[max_size];  // заменяем старый массив новым

        // Сбрасываем счётчик элементов
        size = 0;
    }

}
