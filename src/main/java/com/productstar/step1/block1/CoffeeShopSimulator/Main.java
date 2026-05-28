package com.productstar.step1.block1.CoffeeShopSimulator;

// класс Main - точка входа в программу
public class Main {
    public static void main(String[] args) {
        // создаём объект кофейни (вызывается конструктор CoffeeShop)
        CoffeeShop shop = new CoffeeShop();

        // создаём конкретные позиции меню:
        // Coffee - имя, цена, крепость (int strength)
        Coffee espresso = new Coffee("Эспрессо", 1.5, 5);
        // Tea - имя, цена, тип чая (String teaType)
        Tea greenTea = new Tea("Зелёный чай", 1.2, "зелёный");
        // Pastry - имя, цена, начинка (String filling)
        Pastry croissant = new Pastry("Круассан", 2.0, "шоколад");

        // добавляем эти позиции в меню кофейни (метод addMenuItem)
        shop.addMenuItem(espresso);
        shop.addMenuItem(greenTea);
        shop.addMenuItem(croissant);

        // выводим меню на экран
        shop.displayMenu();

        // делаем заказы:
        // takeOrder(индекс_позиции, размер)
        shop.takeOrder(0, Size.SMALL);   // эспрессо маленький
        shop.takeOrder(1, Size.LARGE);    // зелёный чай большой
        shop.takeOrder(2, Size.MEDIUM);   // круассан средний (хотя размер не влияет)

        // выводим статистику (статический метод вложенного класса)
        CoffeeShop.CoffeeShopStats.showStats();
    }
}
