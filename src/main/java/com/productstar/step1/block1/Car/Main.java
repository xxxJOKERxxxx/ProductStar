package com.productstar.step1.block1.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 150, 1200, CarType.SEDAN);
        System.out.println("Управляем машиной: " + car.getName());
        car.startEngine();
        car.turnSteeringWheel();
        car.stopEngine();
    }
}
