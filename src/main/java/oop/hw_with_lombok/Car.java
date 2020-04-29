package oop.hw_with_lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Car {
    private String model;
    private String color;
    private int price;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
