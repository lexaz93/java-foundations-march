package oop.hw;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void printPerimeter() {
        System.out.println("Периметр равен " + (sideA + sideB) * 2);
    }

    @Override
    public void printArea() {
        System.out.println("Площадь равна " + sideA * sideB);
    }

    @Override
    public void printType() {
        System.out.println("Прямоугольник");
    }
}
