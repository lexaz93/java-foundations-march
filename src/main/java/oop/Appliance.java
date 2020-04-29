package oop;

import lombok.Setter;

@Setter
public class Appliance {
    private boolean inShop = true;

    public Appliance() {
        System.out.println("Appliance");
    }

    public void printLocation() {
        if (inShop) {
            System.out.println("В магазине");
        } else {
            System.out.println("Дома");
        }
    }
}
