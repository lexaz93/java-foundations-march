package Task;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Person {
    String firstName;
    String lastName;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastNAme='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
