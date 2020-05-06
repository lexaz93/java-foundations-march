package interfaces;

public class Dog implements Walkable {
    @Override
    public void walk() {
        System.out.println("Я гуляю на четырех лапах");
    }
}
