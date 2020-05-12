package interfaces;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Cat implements Runnable {

    private int maxRunDistance;

    @Override
    public void run() {
        System.out.println("Я бегаю сам по себе");
    }

    @Override
    public int maxRunDistance() {
        return maxRunDistance;
    }

    public Cat(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }
}
