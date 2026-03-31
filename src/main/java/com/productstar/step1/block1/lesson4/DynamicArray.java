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

    static void print() {
        System.out.println("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" " + data[i]);
        }
        System.out.println("]");
    }

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

    static boolean isEmpty() {
        return size == 0;
    }

    static boolean contains(int value) {
        return false;
    }

    static int indexof(int value) {
        return 0;
    }

    static int get(int index) {
        return 0;
    }

    static void remove(int index) {
        if(index < 0 || index >= size) {
    throw new RuntimeException("Index out of bounds!");
        }
        int[] temp = Arrays.copyOf(data,size);
        for (int i = index; i < data.length -1; i++) {
            data[i] = temp[i+1];
        }
        data[data.length-1] = 0;

    }

}
