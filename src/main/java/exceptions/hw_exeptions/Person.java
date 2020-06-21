package exceptions.hw_exeptions;

public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        if (age <= 0) {
            throw new MyRuntimeException("Uncorrect age!");
        } else {
            this.age = age;
        }
    }
}
