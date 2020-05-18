package oop.hw;

public class HomeWork_29_04_20 {
    public static void main(String[] args) {
        Person alex = new Men("Alex", 23);
        alex.printAge();
        alex.printMale();

        Person anna = new Women("Anna", 26);
        anna.printAge();
        anna.printMale();

        Person oleg = new Men("Oleg", 55);

        Person[] names = new Person[]{alex, anna, oleg};
        for (Person human : names) {
            human.printName();
            human.printAge();
        }

        Figure tri = new Triangle(3, 4, 5);
        tri.printType();
        tri.printPerimeter();
        tri.printArea();

        Figure rec = new Rectangle(5, 7);
        rec.printType();
        rec.printPerimeter();
        rec.printArea();

        Figure squa = new Square(6);
        squa.printType();
        squa.printPerimeter();
        squa.printArea();

    }
}
