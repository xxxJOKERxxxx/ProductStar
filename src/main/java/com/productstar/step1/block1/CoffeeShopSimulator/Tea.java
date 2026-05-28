package com.productstar.step1.block1.CoffeeShopSimulator;

// Tea (чай) - наследник MenuItem и реализатор Preparable
public class Tea extends MenuItem implements Preparable {

    private String teaType;   // тип чая (например, "Black", "Green", "Herbal")

    // Конструктор: имя, цена, тип чая
    public Tea(String name, double price, String teaType) {
        super(name, price);       // вызов конструктора родителя MenuItem
        this.teaType = teaType;   // сохраняем тип чая
    }

    // Геттер для типа чая (необязательно, но для полноты)
    public String getTeaType() {
        return teaType;
    }

    // Реализация метода prepare() из интерфейса Preparable
    @Override
    public void prepare() {
        System.out.println("Завариваем чай '" + getName() + "' (" + teaType + ")");
    }
}
