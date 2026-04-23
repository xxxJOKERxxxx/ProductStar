package com.productstar.step1.block1.lesson6;

// Класс для одного узла дерева
class Node {
    int value;      // значение в узле
    Node left;      // левый ребёнок (меньше)
    Node right;     // правый ребёнок (больше)

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

// Класс для бинарного дерева поиска
class BinarySearchTree {
    private Node root;  // корень дерева

    // Метод для добавления нового значения
    public void add(int value) {
        root = addRecursive(root, value);
    }

    // Вспомогательный рекурсивный метод для добавления
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    // Метод для поиска минимального значения
    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("Дерево пустое");
        }
        return findMinRecursive(root);
    }

    // Вспомогательный рекурсивный метод для поиска минимума
    private int findMinRecursive(Node current) {
        // Если нет левого ребёнка — текущий узел и есть минимум
        if (current.left == null) {
            return current.value;
        }
        // Иначе идём дальше налево
        return findMinRecursive(current.left);
    }
}

// Главный класс для запуска
public class BinaryTreePractice {
    public static void main(String[] args) {
        // Создаём дерево
        BinarySearchTree tree = new BinarySearchTree();

        // Добавляем числа (как в задании)
        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);

        // Находим и выводим минимальное значение
        System.out.println("Минимальное значение в дереве: " + tree.findMin());
    }
}
