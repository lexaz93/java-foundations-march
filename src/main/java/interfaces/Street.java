package interfaces;

public class Street {
    public static void main(String[] args) {
        Walkable alex = new Men();
        Walkable tuzik = new Dog();

        Walkable[] walkables = new Walkable[2];
        walkables[0] = alex;
        walkables[1] = tuzik;

        printWalkables(walkables);

        Runnable murzik = new Cat();
        murzik.run();
        Runnable bagirA = new Cat(10);
        System.out.println("bagirA.maxRunDistance() = " + bagirA.maxRunDistance());

        Flyable vorobey = new Bird("Чирик");
        vorobey.fly();
        System.out.println("vorobey.sing() = " + vorobey.sing());

        Swimable shark = new Fish(15.6);
        shark.swim();
        System.out.println("shark.maxSwimSpeed() = " + shark.maxSwimSpeed());

        Vodka finlandia = new Vodka("Finlandia", "Надонышке");
        Drinkable sivuha = new Vodka("Handmade", 3);

        sivuha.drinkTooMuch();
        System.out.println("finlandia.getName() = " + finlandia.getName());

        GoldenFish gf = new GoldenFish();
        gf.swim();
        gf.createWish();
        gf.createWish();
        gf.createWish();
        gf.createWish();
        

    }
    
    public static  void printWalkables(Walkable[] walkables) {
        for (Walkable walkable: walkables) {
            walkable.walk();
        }
    }
}
