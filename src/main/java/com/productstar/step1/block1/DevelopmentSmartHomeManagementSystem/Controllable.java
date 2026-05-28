package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

// Интерфейс – контракт, который обязует реализовать два метода
public interface Controllable {
    // public abstract по умолчанию, можно не писать
    public void increaseValue(); // увеличить значение
    public void decreaseValue(); // уменьшить значение
}