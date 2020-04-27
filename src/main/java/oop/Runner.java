package oop;

public class Runner {
    public static void main(String[] args) {
        Iron alexIron = new Iron("White");

        System.out.println(alexIron.getColor());
        alexIron.setColor("Black");
        System.out.println(alexIron.getColor());

    }
}
