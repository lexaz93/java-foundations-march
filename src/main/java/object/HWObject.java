package object;

import oop.hw.*;
import org.w3c.dom.ls.LSOutput;

public class HWObject {
    public static void main(String[] args) {
        Contact jordan = new Contact("Belford", "Jordan", 36, "89111112233", 567239);
        Contact donny = new Contact("", "Donny", 31, "89111112233", 634275);

        System.out.println("Есть 2 контакта: " + jordan.getLastName() + " и " + donny.getLastName());

        if (jordan.hashCode() == donny.hashCode()) {
            System.out.println("Телефон общий");
        }

        if (!(jordan.equals(donny))) {
            System.out.println("Но это разные люди");
        }

        Person anna = new Women("Anna", 26);
        System.out.println(anna.toString());

        Person alex = new Men("Alex", 27);
        System.out.println(alex.toString());

        Figure tri = new Triangle(3, 4, 5);
        System.out.println(tri.toString());

        Figure qva = new Square(7);
        System.out.println(qva.toString());

    }
}
