package Task;

public class Friend extends Person {
    public Friend(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return getFirstName() + ":Погнали мужики!";
    }
}
