package com.productstar.step1.block1.CoffeeShopSimulator;

// Coffee (кофе) - наследник MenuItem и реализатор Preparable
public class Coffee extends MenuItem implements Preparable {

    private int strength;   // крепость кофе (1 - слабый, 5 - очень крепкий)

    // Конструктор: принимает имя, цену и крепость
    public Coffee(String name, double price, int strength) {
        super(name, price);      // вызываем конструктор родителя (MenuItem)
        this.strength = strength; // сохраняем крепость
    }

    // Геттер для крепости (чтобы можно было узнать крепость извне)
    public int getStrength() {
        return strength;
    }

    // Реализация метода prepare() из интерфейса Preparable
    @Override
    public void prepare() {
        System.out.println("Готовим кофе '" + getName() + "' (крепость: " + strength + " из 5)");
        // Здесь можно добавить логику приготовления, но для учебного задания просто вывод
    }
}
