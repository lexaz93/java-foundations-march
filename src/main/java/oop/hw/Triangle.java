package oop.hw;

import java.util.Objects;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void printArea() {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        System.out.println("Площадь равна " + Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC)));
    }

    @Override
    public double getArea() {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    @Override
    public void printType() {
        System.out.println("Треугольник");
    }

    @Override
    public void printPerimeter() {
        System.out.println("Периметр равен " + (sideA + sideB + sideC));
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB + sideC);
    }

    @Override
    public String toString() {
        return "Треугольник со сторонами " + sideA + ", " + sideB + ", " + sideC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getArea(), getArea()) == 0;
    }

    @Override
    public int hashCode() {
        return (int) (sideA + sideB + sideC);
    }
}
