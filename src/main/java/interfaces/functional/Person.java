package interfaces.functional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person implements Comparable<Person>, Cloneable {
    private String FirsName;
    private String LastName;
    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirsName='" + FirsName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (getFirsName().equals(o.getFirsName())) {
            if (getLastName().equals(o.getLastName())) {
                if (getAge() == o.getAge()) {
                    return 0;
                } else if (getAge() < o.getAge()) {
                    return  -1;
                } else {
                    return 1;
                }
            } else {
                for (int i = 0; i < Math.min(getLastName().length(), o.getLastName().length()); i++) {
                    if (getLastName().charAt(i) < o.getLastName().charAt(i)) {
                        return -1;
                    } else if (getLastName().charAt(i) > o.getLastName().charAt(i)) {
                        return 1;
                    }
                }
            }


        } else {
            for (int i = 0; i < Math.min(getFirsName().length(), o.getFirsName().length()); i++) {
                if (getFirsName().charAt(i) < o.getFirsName().charAt(i)) {
                    return -1;
                } else if (getFirsName().charAt(i) > o.getFirsName().charAt(i)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
