package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

public class SmartTV extends SmartDevice implements Controllable {

    private int volume;   // громкость 0..100
    private int channel;   // номер канала 1..999

    public SmartTV(String name, RoomType room) {
        super(name, room);
        volume = 20;   // начальная громкость 20%
        channel = 1;    // первый канал
    }

    @Override
    public void increaseValue() {
        if (isOn) {
            volume += 5;        // увеличиваем на 5
            if (volume > 100) {
                volume = 100;   // максимум 100
            }
            System.out.println(name + ": громкость увеличена до " + volume);
        } else {
            System.out.println(name + " выключен, регулировка недоступна.");
        }
    }

    @Override
    public void decreaseValue() {
        if (isOn) {
            volume -= 5;
            if (volume < 0) {
                volume = 0;
            }
            System.out.println(name + ": громкость уменьшена до " + volume);
        } else {
            System.out.println(name + " выключен, регулировка недоступна.");
        }
    }

    // Собственный метод телевизора (не из интерфейса)
    public void nextChannel() {
        if (isOn) {
            channel += 1;
            if (channel > 999) { // если больше 999, возвращаемся на 1
                channel = 1;
            }
            System.out.println(name + ": переключён на канал " + channel);
        } else {
            System.out.println(name + " выключен, переключение канала недоступно.");
        }
    }

    @Override
    public String getStatus() {
        String state;
        if (isOn) {
            state = "включен";
        } else {
            state = "выключен";
        }
        return "Телевизор '" + name + "' (" + room + ") - " + state +
                ", громкость: " + volume + ", канал: " + channel;
    }
}
