package Task;

public class Girlfriends extends Person {
    public Girlfriends(String firstName, String lastName, int age) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setAge(age);
    }

    @Override
    public String toString() {
        return getFirstName() + ": Подожди мне надо накраситься";
    }
}
