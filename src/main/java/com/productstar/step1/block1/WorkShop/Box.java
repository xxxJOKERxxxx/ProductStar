package com.productstar.step1.block1.WorkShop;

public class Box extends Rectangle {

    private double c;

    public Box(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public double getVolume() {
        return a * b * c;
    }

}
