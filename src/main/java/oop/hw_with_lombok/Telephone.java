package oop.hw_with_lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Telephone {
    private String brand;
    private int cost;

    public Telephone(String brand) {
        this.brand = brand;
    }
}
