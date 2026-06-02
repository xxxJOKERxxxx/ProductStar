package com.productstar.step1.block1.Example;

public class Triangle {

    private double a;
    private double b;
    private double c;

    // Конструктор
    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Side cannot be less than or equal to 0");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Геттеры
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Сеттеры
    public void setA(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Side cannot be less than or equal to 0");
        }
        this.a = a;
    }

    public void setB(double b) {
        if (b <= 0) {
            throw new IllegalArgumentException("Side cannot be less than or equal to 0");
        }
        this.b = b;
    }

    public void setC(double c) {
        if (c <= 0) {
            throw new IllegalArgumentException("Side cannot be less than or equal to 0");
        }
        this.c = c;
    }

    // Метод для вычисления периметра
    public double getPerimeter() {
        return a + b + c;
    }

    // Метод для вычисления площади по формуле Герона
    public double getArea() {
        double p = getPerimeter() / 2; // Полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
