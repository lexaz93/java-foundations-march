package finalMod;

public class Headphones {
    private String color;
    private final boolean hasBluetooth;
    private String owner;

    public static final double MINIMUM_VOLUME = 20.0;

    public Headphones(boolean hasBluetooth, String owner) {
        this.hasBluetooth = hasBluetooth;
        this.owner = owner;
    }
}
