package oop.hw;

public class Triangle extends Figure {
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
    public void printType() {
        System.out.println("Треугольник");
    }
}
