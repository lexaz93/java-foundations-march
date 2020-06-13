package collections.my_lists.set;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Glass {
    private String material;
    private double mls;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glass glass = (Glass) o;
        return Double.compare(glass.mls, mls) == 0 &&
                Objects.equals(material, glass.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, mls);
    }

    @Override
    public String toString() {
        return "Glass{" +
                "material='" + material + '\'' +
                ", mls=" + mls +
                '}';
    }
}
