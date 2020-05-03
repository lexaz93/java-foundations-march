package oop.hw;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
    boolean isMale;
    String name;
    int age;

    public void printName() {
        System.out.println(name);
    }

    public void printAge() {
        System.out.println(age);
    }

    public void printMale() {
        if (isMale) {
            System.out.println("Мужичина");
        } else {
            System.out.println("Девушка");
        }
    }
}
