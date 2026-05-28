// Указываем, в каком пакете (папке) лежит этот класс
package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

// Объявление публичного класса Main (имя совпадает с именем файла)
public class Main {

    // Главный метод – точка входа в программу. С него всё начинается.
    // public – виден всем; static – вызывается без создания объекта;
    // void – ничего не возвращает; String[] args – аргументы командной строки (не используются)
    public static void main(String[] args) {

        // Создаём объект умного дома. Вызывается конструктор SmartHome()
        SmartHome myHome = new SmartHome();

        // Создаём умную лампу с именем "Гостиная лампа" и типом комнаты LIVING_ROOM (гостиная)
        SmartLight lamp = new SmartLight("Гостиная лампа", RoomType.LIVING_ROOM);
        // Создаём термостат для спальни
        SmartThermostat thermostat = new SmartThermostat("Спальный термостат", RoomType.BEDROOM);
        // Создаём телевизор для кухни
        SmartTV tv = new SmartTV("Кухонный телевизор", RoomType.KITCHEN);

        // Добавляем каждое устройство в дом через метод addDevice
        myHome.addDevice(lamp);
        myHome.addDevice(thermostat);
        myHome.addDevice(tv);

        // Включаем лампу (метод turnOn из SmartDevice)
        lamp.turnOn();
        // увеличиваем статистику
        SmartHome.HomeStats.incrementActiveDevices();
        // Увеличиваем яркость лампы на 10 (метод из Controllable)
        lamp.increaseValue();
        // Ещё раз увеличиваем яркость (станет 20)
        lamp.increaseValue();

        // Включаем термостат
        thermostat.turnOn();
        // увеличиваем статистику
        SmartHome.HomeStats.incrementActiveDevices();
        // Уменьшаем температуру на 1 градус
        thermostat.decreaseValue();

        // Включаем телевизор
        tv.turnOn();
        // увеличиваем статистику
        SmartHome.HomeStats.incrementActiveDevices();
        // Увеличиваем громкость на 5
        tv.increaseValue();
        // Переключаем канал (собственный метод телевизора)
        tv.nextChannel();

        // Показываем состояние всех устройств в доме
        myHome.showAllStatuses();

        // Выводим статистику (статические методы вложенного класса HomeStats)
        SmartHome.HomeStats.showStats();

        // Выключаем все устройства
        myHome.turnOffAllDevices();

        // Снова выводим статистику (активных устройств должно стать 0)
        SmartHome.HomeStats.showStats();
    }
}
