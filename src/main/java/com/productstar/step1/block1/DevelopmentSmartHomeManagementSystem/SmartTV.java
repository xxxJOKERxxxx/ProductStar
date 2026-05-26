package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

public class SmartTV extends SmartDevice implements Controllable {

    private int volume;
    private int chanel;

    public SmartTV(String name, RoomType room) {
        super(name, room);
        volume = 20;
        chanel = 1;
    }

    @Override
    public void increaseValue() {
        if (isOn) {
            volume += 5;
            if (volume > 100) {
                volume = 100;
            }
            System.out.println(name + ": громкость увеличена до " + volume);
        } else {
            System.out.println(name + " выключен, регулировка недоступна.");
        }
    }

    @Override
    public void decreaseValue() {
        if (isOn) {
            volume -=5;
            if (volume < 0) {
                volume = 0;
            }
            System.out.println(name + ": громкость уменьшена до " + volume);
        }else {
            System.out.println(name + " выключен, регулировка недоступна.");
        }

    }

    public void nextChannel() {
        if (isOn) {
            chanel +=1;
            if (chanel > 999) {
                chanel =1;
            }
            System.out.println(name + ": переключён на канал " + chanel);
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
                ", громкость: " + volume + ", канал: " + chanel;
    }
}
