package Task;

public class Friends extends Person {
    public Friends(String firstName, String lastName, int age) {
        super.firstName = firstName;
        super.lastName = lastName;
        super.age = age;
    }

    @Override
    public String toString() {
        return firstName + ":Погнали мужики!";
    }
}
