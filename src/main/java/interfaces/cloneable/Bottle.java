package interfaces.cloneable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bottle implements Cloneable {
    private double mls;
    private String material;
    private String brand;

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return new Bottle(mls, material, brand);
        return super.clone();
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "mls=" + mls +
                ", material='" + material + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
