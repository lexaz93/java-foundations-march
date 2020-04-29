package oop;

public class Runner {
    public static void main(String[] args) {
//        Iron alexIron = new Iron("White");
//
//        System.out.println(alexIron.getColor());
//        alexIron.setColor("Black");
//        System.out.println(alexIron.getColor());

//        Iron bestIron = new Iron("Black");
        Appliance bestIron = new Iron("Black");
        bestIron.printLocation();
        bestIron.setInShop(false);
        bestIron.printLocation();

//        bestIron.getColor(); Ссылка типа Appliance, а метод в Iron

        Appliance bosch = new WashingMachine();
        bosch.printLocation();

        Cat simba = new Lion();
        simba.printSound();

        Cat bagira = new Panther();
        bagira.printSound();

        Person alex = new Men();
        alex.setAge(27);
        alex.printAge();
        if (alex.isMale) {
            System.out.println("Мужик");
        } else {
            System.out.println("Баба");
        }

        Person anna = new Women();
        anna.printAge();
        if (anna.isMale) {
            System.out.println("Мужик");
        } else {
            System.out.println("Баба");
        }


    }
}
