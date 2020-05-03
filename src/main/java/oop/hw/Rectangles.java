package oop.hw;

public class Rectangles extends Figure {
    public Rectangles(double sideA, double sideB) {
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
