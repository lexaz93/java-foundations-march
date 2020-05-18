package interfaces.cloneable;

public class AlcoShop {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bottle saintSpringBottle = new Bottle(500, "plastic", "Saint spring");
        Bottle shishkinWoodBotle = new Bottle(700, "plastic", "Shishkin wood");

        Bottle saintSpringBottle2 = (Bottle) saintSpringBottle.clone();
        System.out.println(saintSpringBottle2.toString());
    }
}
