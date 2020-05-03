package oop.hw;

public class Women extends Person {
    public Women(String name, int age) {
        this.isMale = false;
        this.name = name;
        this.age = age;
    }


    @Override
    public void printAge() {
        System.out.println("Мне всегда 18");
    }
}
