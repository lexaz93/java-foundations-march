package interfaces;

public class Fish implements Swimable {
    private double maxSwimSpeed;
    @Override
    public void swim() {
        System.out.println("Моя стихия вода");
    }

    @Override
    public double maxSwimSpeed() {
        return maxSwimSpeed;
    }

    public Fish(double maxSwimSpeed) {
        this.maxSwimSpeed = maxSwimSpeed;
    }
}
