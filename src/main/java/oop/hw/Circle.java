package oop.hw;

import java.util.Objects;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void printPerimeter() {
        System.out.println("Длина окружности равна " + 2 * PI * radius);
        ;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void printArea() {
        System.out.println("Площадь равна " + PI * radius * radius);
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void printType() {
        System.out.println("Круг");
    }

    @Override
    public String toString() {
        return "Круг с радиусом " + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return (circle.radius - radius) < 0.01;
    }

    @Override
    public int hashCode() {
        return (int) radius;
    }
}
