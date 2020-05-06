package object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
public class Contact {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private long brokerAccountNumber;

    @Override
    public String toString() {
        return
                "firstName '" + firstName + '\'' + ", lastName '" + lastName + '\'' + ", age " + age + ", phoneNumber " + phoneNumber + ", brokerAccountNumber " + brokerAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return age == contact.age &&
                phoneNumber == contact.phoneNumber &&
                brokerAccountNumber == contact.brokerAccountNumber &&
                Objects.equals(firstName, contact.firstName) &&
                lastName.equals(contact.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }
}
