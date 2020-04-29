package oop;

public class Women extends Person {
    boolean isMale = false;
//    public Women(String name, int age) {
//        this.isMale = false;
//        this.name = name;
//        this.age = age;
//    }


    @Override
    public void printAge() {
        System.out.println("Мне всегда 18");
    }
}
