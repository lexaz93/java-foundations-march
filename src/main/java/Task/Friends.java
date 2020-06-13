package Task;

public class Friends extends Person {
    public Friends(String firstName, String lastName, int age) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setAge(age);
    }

    @Override
    public String toString() {
        return getFirstName() + ":Погнали мужики!";
    }
}
