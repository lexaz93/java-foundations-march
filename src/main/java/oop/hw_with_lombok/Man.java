package oop.hw_with_lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class Man implements Serializable {
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
