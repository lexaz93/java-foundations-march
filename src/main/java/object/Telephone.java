package object;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Telephone {
    private String type;
    private int modelNumber;

    @Override
    public String toString() {
        return type + " " + modelNumber;
    }

    @Override
    public int hashCode() {
        return modelNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return modelNumber == telephone.modelNumber &&
                type.equals(telephone.type);
    }
}
