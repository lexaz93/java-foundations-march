package oop;

import lombok.Setter;

@Setter
public class Person {
    boolean isMale;
    String name;
    int age;

    public  void printAge() {
        System.out.println(age);
    }
}
