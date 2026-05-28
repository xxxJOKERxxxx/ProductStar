package com.productstar.step1.block1.CoffeeShopSimulator;

// Pastry (выпечка) - наследник MenuItem, не реализует Preparable
public class Pastry extends MenuItem {

    private String filling;   // начинка (например, "яблоко", "вишня", "шоколад")

    // Конструктор: имя, цена, начинка
    public Pastry(String name, double price, String filling) {
        super(name, price);      // вызов конструктора родителя
        this.filling = filling;  // сохраняем начинку
    }

    // Геттер для начинки (по желанию)
    public String getFilling() {
        return filling;
    }

    // У выпечки нет метода prepare(), так как она не готовится под заказ
}
