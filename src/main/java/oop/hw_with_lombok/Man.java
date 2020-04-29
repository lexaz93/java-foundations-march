package oop.hw_with_lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Man {
    private String name;
    private String gender;
    private String nation;

    public Man(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Man(String nation) {
        this.nation = nation;
    }
}
