package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

// Класс SmartLight наследует SmartDevice и реализует интерфейс Controllable
public class SmartLight extends SmartDevice implements Controllable {

    private int brightness; // яркость (0..100), private – только внутри этого класса

    // Конструктор: принимает имя и комнату, передаёт их родителю через super()
    public SmartLight(String name, RoomType room) {
        super(name, room);  // вызов конструктора SmartDevice
        this.brightness = 0; // начальная яркость 0 (выключена)
    }

    // Реализация метода increaseValue из интерфейса Controllable
    @Override // аннотация – проверяем, что метод переопределён правильно
    public void increaseValue() {
        if (isOn == true) { // если лампа включена (можно писать if(isOn))
            brightness += 10; // увеличиваем яркость на 10
            if (brightness > 100) { // проверяем, не превысила ли максимум
                brightness = 100;   // ограничиваем 100
            }
            System.out.println(name + ": яркость увеличена до " + brightness);
        } else { // если выключена
            System.out.println(name + " выключена, регулировка недоступна!");
        }
    }

    // Реализация decreaseValue
    @Override
    public void decreaseValue() {
        if (isOn == true) {
            brightness -= 10; // уменьшаем на 10
            if (brightness < 0) { // проверяем, не ушла ли в минус
                brightness = 0;    // ограничиваем 0
            }
            System.out.println(name + ": яркость уменьшена до " + brightness);
        } else {
            System.out.println(name + " выключена регулировка недоступна!");
        }
    }

    // Реализация абстрактного метода getStatus из SmartDevice
    @Override
    public String getStatus() {
        String state; // переменная для хранения текста "включена"/"выключена"
        if (isOn) {
            state = "включена";
        } else {
            state = " выключена";
        }
        // Возвращаем строку с информацией о лампе
        return "Лампа '" + name + "' (" + room + ") - " + state + ", яркость: " + brightness;
    }
}
