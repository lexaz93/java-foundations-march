package annotations.lecture;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Party {

    @SneakyThrows
    public static void main(String[] args) {
        Person person = new Person("George");
        System.out.println(person);

        final Class<?> clazzPerson = Class.forName("annotations.lecture.Person");

        Field fieldIsGood = clazzPerson.getField("isGood");


        Constructor constructorPerson = clazzPerson.getConstructor(String.class);
        Person person1 = (Person) constructorPerson.newInstance("Zhorik");
        System.out.println(person1);


        Field fieldAge = clazzPerson.getDeclaredField("age");
        fieldAge.setAccessible(true);
        fieldAge.setInt(person1, 26);
        System.out.println(person1);

//        MyAnnotation annotation = clazzPerson.getAnnotation(MyAnnotation.class);
//        if (annotation != null) {
//            System.out.println("annotation.message() = " + annotation.message());
//        }


        if (Person.class.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = clazzPerson.getAnnotation(MyAnnotation.class);
            if(annotation.flag()) {
                System.out.println("annotation.message() = " + annotation.message());
            }

        }


    }
}
