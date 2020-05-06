package oop.hw;

import oop.hw.Person;

public class Men extends Person {
    public Men(String name, int age) {
        super.isMale = true;
        super.name = name;
        super.age = age;
    }

    public String toString() {
        String isMale;
        if (this.isMale) {
            isMale = "Мужичина";
        } else {
            isMale = "Девушка";
        }
        return "Пол " + isMale + ", Имя '" + name + '\'' + ", Возраст " + age;
    }
}
