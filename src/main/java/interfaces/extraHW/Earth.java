package interfaces.extraHW;

public class Earth {
    public static void main(String[] args) {
        Man alex = new Man();
        Cow murka = new Cow();
        Plant oduvanchik = new Plant();

        alex.eat();
        alex.talk();

        murka.talk();
        murka.eat();

        oduvanchik.eat();
        oduvanchik.talk();
    }
}
