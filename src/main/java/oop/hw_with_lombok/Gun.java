package oop.hw_with_lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Gun {
    private String type;
    private String country;
    private int clip;

    public Gun() {

    }
}
