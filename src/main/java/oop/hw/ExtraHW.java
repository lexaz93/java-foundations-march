package oop.hw;

public class ExtraHW {
    public static void main(String[] args) {
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

        Figure kru = new Circle(3);
        kru.printType();
        kru.printArea();
        kru.printPerimeter();

        System.out.println(tri.toString());
        System.out.println(kru.toString());
        System.out.println(rec.toString());

        Figure tri1 = new Triangle(5, 4, 3);
        System.out.println("tri.equals(tri1) = " + tri.equals(tri1));


        Figure rec1 = new Rectangle(6, 6);
        System.out.println("rec.equals(rec1) = " + rec.equals(rec1));

        Figure kru1 = new Circle(6);
        System.out.println("kru.equals(kru1) = " + kru.equals(kru1));
    }
}
