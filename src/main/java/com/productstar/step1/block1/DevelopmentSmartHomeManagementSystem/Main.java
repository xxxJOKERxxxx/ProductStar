package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

public class Main {
    public static void main(String[] args) {

        SmartHome myHome = new SmartHome();

        SmartLight lamp = new SmartLight("Гостиная лампа", RoomType.LIVING_ROOM);
        SmartThermostat thermostat = new SmartThermostat("Спальный термостат", RoomType.BEDROOM);
        SmartTV tv = new SmartTV("Кухонный телевизор", RoomType.KITCHEN);

        myHome.addDevice(lamp);
        myHome.addDevice(thermostat);
        myHome.addDevice(tv);

        lamp.turnOn();
        lamp.increaseValue();
        lamp.increaseValue();

        thermostat.turnOn();
        thermostat.decreaseValue();

        tv.turnOn();
        tv.increaseValue();
        tv.nextChannel();

        myHome.showAllStatuses();

        SmartHome.HomeStats.showStats();

        myHome.turnOffAllDevice();
        SmartHome.HomeStats.showStats();
    }
}
