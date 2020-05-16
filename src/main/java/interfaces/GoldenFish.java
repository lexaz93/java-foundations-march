package interfaces;

public class GoldenFish implements Creatable, Swimable {
    private int wishCount = 3;

    @Override
    public void createWish() {
        if (wishCount > 0) {
            System.out.println("Излагай свое желание");
            wishCount--;
        } else {
            System.out.println("Гуляй Вася, халява кончилась!");
        }
    }

    @Override
    public void swim() {
        System.out.println("Я исполняю желания а не плаваю");
    }

    @Override
    public double maxSwimSpeed() {
        return 0;
    }
}
