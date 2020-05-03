package oop.hw;

public class Square extends Figure {
    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public void printPerimeter() {
        System.out.println("Периметр равен " + sideA * 4);
    }

    @Override
    public void printArea() {
        System.out.println("Площадь равна " + sideA * sideA);
    }

    @Override
    public void printType() {
        System.out.println("Квадрат");
    }
}
