package interfaces.extraHW;

public class Cow implements Eatable, Talkable {

    @Override
    public void talk() {
        System.out.println("Муууу");
    }
}
