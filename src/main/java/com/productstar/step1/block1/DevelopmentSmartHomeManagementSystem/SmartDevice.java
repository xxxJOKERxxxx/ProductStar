package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

public abstract class SmartDevice {
    protected String name;
    protected boolean isOn;
    protected RoomType room;


    public SmartDevice(String name, RoomType room) {
        this.name = name;
        this.room = room;
        this.isOn = false;

    }
    public final void turnOn() {
        isOn = true;
        System.out.println(name + "включено!");
    }
    public final void turnOff() {
        isOn = false;
        System.out.println("Выключено!");
    }
    public abstract String getStatus();

    public String getName() {
        return name;
    }
}
