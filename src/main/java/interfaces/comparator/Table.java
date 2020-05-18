package interfaces.comparator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Table implements Comparable<Table> {
    private double width;
    private double length;
    private double high;
    private String material;

    @Override
    public String toString() {
        return "Table{" +
                "width=" + width +
                ", length=" + length +
                ", high=" + high +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public int compareTo(Table o) {
//        if (!(o instanceof Table)) {
//            throw new ClassCastException("This isn't table");
//        }
        if (getVolume() > ((Table) o).getVolume()) {
            return 1;
        } else if (getVolume() < ((Table) o).getVolume()) {
            return -1;
        } else {
            return 0;
        }
    }

    private double getVolume() {
        return width * length * high;
    }

}
