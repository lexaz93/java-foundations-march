package interfaces;

public class Dog implements Walkable, Comparable {
    @Override
    public void walk() {
        System.out.println("Я гуляю на четырех лапах");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
