package interfaces.functional;

import lombok.NoArgsConstructor;

import java.util.Comparator;

@NoArgsConstructor
public class PersonComparator implements Comparator <Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getFirsName().equals(o2.getFirsName())) {
            if (o1.getLastName().equals(o2.getLastName())) {
                if (o1.getAge() == o2.getAge()) {
                    return 0;
                } else if (o1.getAge() < o2.getAge()) {
                    return  -1;
                } else {
                    return 1;
                }
            } else {
                for (int i = 0; i < Math.min(o1.getLastName().length(), o2.getLastName().length()); i++) {
                    if (o1.getLastName().charAt(i) < o2.getLastName().charAt(i)) {
                        return -1;
                    } else if (o1.getLastName().charAt(i) > o2.getLastName().charAt(i)) {
                        return 1;
                    }
                }
            }


        } else {
            for (int i = 0; i < Math.min(o1.getFirsName().length(), o2.getFirsName().length()); i++) {
                if (o1.getFirsName().charAt(i) < o2.getFirsName().charAt(i)) {
                    return -1;
                } else if (o1.getFirsName().charAt(i) > o2.getFirsName().charAt(i)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
