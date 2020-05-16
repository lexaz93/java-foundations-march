package interfaces;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Bird implements Flyable {
    private String sing;

    @Override
    public void fly() {
        System.out.println("Я злая птица, борюсь против свиней!");
    }

    @Override
    public String sing() {
        return sing;
    }

    public Bird(String sing) {
        this.sing = sing;
    }
}
