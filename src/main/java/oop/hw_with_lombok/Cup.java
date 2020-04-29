package oop.hw_with_lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Cup {
    private String material;
    private String color;

    public Cup(String material) {
        this.material = material;
    }
}
