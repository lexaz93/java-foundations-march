package oop.hw;

import java.util.Objects;

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
    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public void printArea() {
        System.out.println("Площадь равна " + sideA * sideB);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void printType() {
        System.out.println("Прямоугольник");
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами " + sideA + ", " + sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.getPerimeter(), getPerimeter()) == 0;
    }

    @Override
    public int hashCode() {
        return (int)(sideA + sideB);
    }
}
