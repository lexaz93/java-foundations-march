package task;

public class Girlfriend extends Person {
    public Girlfriend(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return getFirstName() + ": Подожди мне надо накраситься";
    }
}
