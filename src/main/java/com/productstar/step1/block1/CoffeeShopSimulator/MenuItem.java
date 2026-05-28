package com.productstar.step1.block1.CoffeeShopSimulator;

// MenuItem (позиция меню) – абстрактный класс, нельзя создать объект напрямую
public abstract class MenuItem {
    // protected – доступно внутри пакета и в классах-наследниках
    protected String name;   // название (например, "Латте")
    protected double price;   // цена (например, 180.0)

    // Конструктор – вызывается при создании конкретного пункта меню (кофе, чай, выпечка)
    public MenuItem(String name, double price) {
        this.name = name;   // сохраняем переданное имя
        this.price = price; // сохраняем цену
    }

    // Геттер для имени (public, чтобы внешние классы могли получить название)
    public String getName() {
        return name;
    }

    // Геттер для цены
    public double getPrice() {
        return price;
    }
}
