package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

public class SmartThermostat extends SmartDevice implements Controllable{

    private int temperature;

    public SmartThermostat(String name, RoomType room) {
        super(name, room);
        temperature = 22;
    }

    @Override
    public void increaseValue() {
        if(isOn) {
            temperature +=1;
            if(temperature > 30) {
                temperature = 30;
            }
            System.out.println(name + ": температура повышена до " + temperature + "°C");
        } else {
            System.out.println(name + " выключен, регулировка недоступна.");
        }
    }

    @Override
    public void decreaseValue() {
        if (isOn) {
            temperature -=1;
            if (temperature < 10) {
                temperature = 10;
            }
            System.out.println(name + ": температура понижена до " + temperature + "°C");
        } else {
            System.out.println(name + " выключен, регулеровка недоступна.");
        }

    }

    @Override
    public String getStatus() {
        String state;
        if (isOn) {
            state = "включён";
        }else {
            state = "выключен";
        }
        return "Термостат '" + name + "' (" + room + ") - " + state + ", температура: " + temperature + "°C";
    }
}
