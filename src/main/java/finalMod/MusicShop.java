package finalMod;

public class MusicShop {
    public static void main(String[] args) {
        Headphones airpods = new Headphones(true, "Alex");
        Headphones phillips = new Headphones(false, "Anna");

        System.out.println("Headphones.MINIMUM_VOLUME = " + Headphones.MINIMUM_VOLUME);
    }
}
