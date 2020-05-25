package interfaces.functional;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person alex = new Person("Alex", "Sinitsyn", 28);
        Person alex1 = new Person("Alex", "Sinitsyn", 27);
        System.out.println(alex.compareTo(alex1));

        Person yura =(Person) alex.clone();
        System.out.println(yura.getFirsName());
        yura.setLastName("Ivanov");

        Person [] humans = new Person[] {alex1, alex, yura};
        Arrays.sort(humans);
        System.out.println(Arrays.toString(humans));

        PersonComparator personComparator = new PersonComparator();
        System.out.println(personComparator.compare(alex, alex1));


    }
}
