package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

// Абстрактный класс – нельзя создать объект SmartDevice, только наследники
public abstract class SmartDevice {

    // protected – видно внутри пакета и в классах-наследниках
    protected String name;   // имя устройства (например, "Гостиная лампа")
    protected boolean isOn;  // состояние: true = включено, false = выключено
    protected RoomType room; // тип комнаты (из перечисления RoomType)

    // Конструктор – вызывается при создании объекта наследника
    public SmartDevice(String name, RoomType room) {
        this.name = name;   // присваиваем полю name значение параметра
        this.room = room;   // присваиваем полю room значение параметра
        this.isOn = false;  // новое устройство по умолчанию выключено
    }

    // final – метод нельзя переопределить в наследниках
    public final void turnOn() {
        isOn = true;   // меняем состояние на "включено"
        System.out.println(name + " включено!"); // сообщение в консоль вкл
    }

    // final – тоже нельзя переопределить
    public final void turnOff() {
        isOn = false;  // выключаем
        System.out.println(name + " выключено!"); // сообщение в консоль выкл
    }

    // Абстрактный метод – без тела, каждый наследник обязан его реализовать
    public abstract String getStatus();

    // Обычный метод – геттер для поля name (чтобы получить имя устройства извне)
    public String getName() {
        return name;   // возвращаем значение поля name
    }
}