package oop.hw;

import oop.hw.Person;

public class Men extends Person {
    public Men(String name, int age) {
        this.isMale = true;
        this.name = name;
        this.age = age;
    }

    @Override
    public void printAge() {
        super.printAge();
    }

    @Override
    public void printMale() {
        super.printMale();
    }

    @Override
    public void printName() {
        super.printName();
    }
}
