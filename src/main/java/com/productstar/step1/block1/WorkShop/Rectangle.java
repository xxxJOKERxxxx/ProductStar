package com.productstar.step1.block1.WorkShop;

public class Rectangle {
     double a;

     double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double newA) {
        if (newA <= 0) {
            throw new IllegalArgumentException("A canot beles than 0");
        }
        this.a = newA;
    }

    public void setB(double newB) {
        if (newB <= 0) {
            throw new IllegalArgumentException("A canot beles than 0");
        }
        this.b = newB;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getArea() {
        return a * b;
    }

    public String toString() {
        return "Rectangle(" + a + ", " + b + ")";
    }
}
