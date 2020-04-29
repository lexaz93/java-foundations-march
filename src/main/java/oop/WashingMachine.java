package oop;

public class WashingMachine extends Appliance {

    @Override
    public void printLocation() {
        System.out.println("Я в ванной");
    }

    public WashingMachine() {
        System.out.println("WashingMachine");
    }
}
