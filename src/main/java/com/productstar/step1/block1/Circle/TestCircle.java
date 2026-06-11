package com.productstar.step1.block1.Circle;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle = new Circle (5.0);
        System.out.println("Радиус круга: " + circle.getRadius());
        circle.getArea();
        System.out.println("Площадь круга: " + circle.getArea());

        try {
            Circle invalidCircle = new Circle(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " +  e.getMessage());
        }

        Circle circle1 = new Circle(3);
        System.out.println("Радиус круга: " + circle1.getRadius());
        System.out.println("Площадь круга: " + circle1.getArea());
        circle1.setRadius(17.0);
        System.out.println("Радиус круга: " + circle1.getRadius());
        System.out.println("Площадь круга: " + circle1.getArea());

        try {
            circle1.setRadius(-5.0);
            System.out.println("Неверный радиус прошел проверку - это ошибка!");
        } catch (IllegalArgumentException e) {
            System.out.println("Сетер верно отклонил радиус: " + e.getMessage());
        }
    }
}
