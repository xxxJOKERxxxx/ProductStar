package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

public class SmartLight extends SmartDevice implements Controllable {
    private int brightness;

    public SmartLight(String name, RoomType room) {
        super(name, room);
        this.brightness = 0;
    }

    @Override
    public void increaseValue() {
        if (isOn == true) {
            brightness += 10;
            if (brightness > 100) {
                brightness = 100;
            }
            System.out.println(name + ": яркость увеличена до " + brightness);
        } else {
            System.out.println(name + " выключена, регулировка недоступна!");
        }

    }

    @Override
    public void decreaseValue() {
        if (isOn == true) {
            brightness -= 10;
            if (brightness < 0) {
                brightness = 0;
            }
            System.out.println(name + ": яркость уменьшена до " + brightness);
        } else {
            System.out.println(name + "выключена регулировка недоступна!");
        }

    }

    @Override
    public String getStatus() {
        String state;
        if (isOn) {
            state = " включена";
        }else {
            state = " Выключена";
        }
        return "Лампа '" + name + "' (" + room + ") - " + state + ", яркость: " + brightness;
    }
}
