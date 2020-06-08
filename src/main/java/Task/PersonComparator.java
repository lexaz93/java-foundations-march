package Task;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getFirstName().equals(o2.getFirstName())) {
            if (o1.getLastName().equals(o2.getLastName())) {
                if ((o1.getAge() == o2.getAge())){
                    return 0;
                } else if ((o1.getAge() < o2.getAge())) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                for (int i = 0; i < Math.min(o1.getLastName().length(), o2.getLastName().length()); i++) {
                    if ((o1.getLastName().charAt(i) == o2.getLastName().charAt(i))){
                        return 0;
                    } else if ((o1.getLastName().charAt(i) < o2.getLastName().charAt(i))) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        } else {
            for (int i = 0; i < Math.min(o1.getFirstName().length(), o2.getFirstName().length()); i++) {
                if ((o1.getFirstName().charAt(i) == o2.getFirstName().charAt(i))){
                    return 0;
                } else if ((o1.getFirstName().charAt(i) < o2.getFirstName().charAt(i))) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }
}
