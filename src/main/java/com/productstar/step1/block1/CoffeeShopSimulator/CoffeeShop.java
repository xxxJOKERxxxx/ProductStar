package com.productstar.step1.block1.CoffeeShopSimulator;

import org.w3c.dom.ls.LSOutput;

// класс CoffeeShop - кофейня
public class CoffeeShop {

    // массив для хранения позиций меню (вместимость 100)
    private MenuItem[] menu;
    // счётчик добавленных позиций
    private int menuCount;

    // конструктор - вызывается при создании кофейни
    public CoffeeShop() {
        menu = new MenuItem[100];   // выделяем память под 100 ячеек
        menuCount = 0;              // пока меню пусто
    }

    // добавить позицию в меню
    public void addMenuItem(MenuItem item) {
        if (menuCount < menu.length) {          // есть свободное место?
            menu[menuCount] = item;             // кладём в первую свободную ячейку
            menuCount++;                        // увеличиваем счётчик
            System.out.println("В меню добавлено: " + item.getName() + " - " + item.getPrice() + " руб.");
        } else {
            System.out.println("Меню переполнено!");
        }
    }

    // показать всё меню с номерами
    public void displayMenu() {
        System.out.println("\n--- Меню кофейни ---");
        for (int i = 0; i < menuCount; i++) {   // проходим по всем добавленным позициям
            MenuItem item = menu[i];            // берём i-ю позицию
            System.out.println(i + ". " + item.getName() + " - " + item.getPrice() + " руб.");
        }
        System.out.println("--------------------");
    }

    // внутренний (нестатический) класс Order - заказ
    public class Order {
        private MenuItem item;   // выбранная позиция
        private Size size;       // размер

        // конструктор заказа
        public Order(MenuItem item, Size size) {
            this.item = item;
            this.size = size;
        }

        // вычислить цену с учётом размера
        public double calculatePrice() {
            double basePrice = item.getPrice();   // базовая цена
            switch (size) {
                case SMALL:  return basePrice;       // маленький - без наценки
                case MEDIUM: return basePrice + 0.5; // средний +0.5
                case LARGE:  return basePrice + 1.0; // большой +1.0
                default:     return basePrice;       // на случай, если что-то пойдёт не так
            }
        }

        // напечатать чек
        public void printReceipt() {
            System.out.println("Чек: " + item.getName() + " (" + size + ") = " + calculatePrice() + " руб.");
        }
    }

    // статический вложенный класс для статистики (общий для всех кофеен)
    public static class CoffeeShopStats {
        private static int totalOrders = 0;     // общее количество заказов
        private static double totalRevenue = 0; // общая выручка

        // добавить заказ в статистику (вызывается после каждого заказа)
        public static void addOrder(double price) {
            totalOrders++;
            totalRevenue += price;
        }

        // показать статистику
        public static void showStats() {
            System.out.println("--- Статистика кофейни ---");
            System.out.println("Всего заказов: " + totalOrders);
            System.out.println("Общая выручка: " + totalRevenue + " руб.");
        }
    }

    // оформить заказ по номеру позиции меню и размеру
    public void takeOrder(int menuIndex, Size size) {
        if (menuIndex < 0 || menuIndex >= menuCount) { // проверка корректности индекса
            System.out.println("Неверный номер позиции!");
            return;
        }
        MenuItem selected = menu[menuIndex];          // выбрали позицию
        Order order = new Order(selected, size);      // создали заказ
        double price = order.calculatePrice();        // посчитали цену
        order.printReceipt();                         // напечатали чек
        CoffeeShopStats.addOrder(price);              // добавили в статистику
    }
}
