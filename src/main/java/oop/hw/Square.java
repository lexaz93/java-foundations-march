package oop.hw;

import java.util.Objects;

public class Square extends Figure {
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public void printPerimeter() {
        System.out.println("Периметр равен " + sideA * 4);
    }

    @Override
    public double getPerimeter() {
        return sideA * 4;
    }

    @Override
    public void printArea() {
        System.out.println("Площадь равна " + sideA * sideA);
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public void printType() {
        System.out.println("Квадрат");
    }

    @Override
    public String toString() {
        return "Сторона квадрата равна " + sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.getArea(), getArea()) == 0;
    }

    @Override
    public int hashCode() {
        return (int)sideA;
    }
}
