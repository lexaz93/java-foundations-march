package Task;

public class Girlfriends extends Person {
    public Girlfriends(String firstName, String lastName, int age) {
        super.firstName = firstName;
        super.lastName = lastName;
        super.age = age;
    }

    @Override
    public String toString() {
        return firstName + ": Подожди мне надо накраситься";
    }
}
