package exceptions;

public class Child {
    private final String name;
    private int age;

    public Child(String name, int age) throws MyException{
        this.name = name;
        if ((age < 0) || (age > 18)) {
            throw new MyException("Uncorrect age");
        }
        this.age = age;
    }
}
