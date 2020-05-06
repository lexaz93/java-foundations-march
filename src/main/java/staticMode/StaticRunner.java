package staticMode;

public class StaticRunner {
    public static void main(String[] args) {
        Car fer = new Car("Ferrari");
        Car.setColor("Red");
        System.out.println(fer);

        Car lam = new Car("Lamborgini");
        Car.setColor("Yellow");
        System.out.println(lam);
        System.out.println(fer);
    }


}
