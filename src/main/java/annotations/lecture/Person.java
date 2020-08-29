package annotations.lecture;

import annotations.lecture.MyAnnotation;
import lombok.RequiredArgsConstructor;

@MyAnnotation(message = "I'm person number one")
@RequiredArgsConstructor

public class Person {
    private final String name;
    private int age;
    public boolean isGood = true;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isGood=" + isGood +
                '}';
    }
}
