package com.productstar.step1.block1.lesson4;

public class DynamicArrayMetods {

    private int[] array;
    private int size;




    public DynamicArrayMetods() {
            array = new int[2];
            size = 0;
        }

        public void add ( int element){
            if (size == array.length) {
                int[] newArray = new int[array.length * 2];
                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }
                array = newArray;
            }
            array[size] = element; // Ошибка: пропущено увеличение размера
            size++;
        }

        public int get ( int index){
            // Ошибка: нет проверки выхода за границы массива
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("индекс выходит за границы массива");
            }
            return array[index];
        }

        public void remove ( int index){
            // Ошибка: удаление элемента не сдвигает оставшиеся элементы
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("индекс выходит за границы массива");
            }
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = 0;
            size--; // Ошибка: размер уменьшается некорректно
        }

        public int size () {
            return size;
        }

    // Добавляем метод main для тестирования
    public static void main(String[] args) {
        DynamicArrayMetods dynamicArray = new DynamicArrayMetods();

        // Тестируем добавление
        System.out.println("Тестирование DynamicArrayMetods:");
        for (int i = 1; i <= 5; i++) {
            dynamicArray.add(i * 10);
            System.out.println("Добавлен элемент " + (i * 10) + ", размер: " + dynamicArray.size());
        }

        // Тестируем получение элементов
        System.out.println("\nЭлементы массива:");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println("array[" + i + "] = " + dynamicArray.get(i));
        }

        // Тестируем удаление
        System.out.println("\nУдаляем элемент с индексом 2:");
        dynamicArray.remove(2);

        System.out.println("Элементы после удаления:");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println("array[" + i + "] = " + dynamicArray.get(i));
        }
    }
    }

