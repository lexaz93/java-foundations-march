package oop.hw_with_lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Shop {
    private String type;
    private String name;

    public Shop(String name) {
        this.name = name;
    }
}
