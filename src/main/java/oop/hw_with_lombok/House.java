package oop.hw_with_lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class House {
    private String type;
    private double area;
    private int numOfFloors;

    public House() {

    }
}
