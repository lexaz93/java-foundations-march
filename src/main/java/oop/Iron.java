package oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Iron extends Appliance {
    private String color;

    public Iron(String color) {
        System.out.println("Iron");
        this.color = color;
        super.setInShop(false);
    }


}
