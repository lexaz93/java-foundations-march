package interfaces.extraHW;

public interface Talkable {
    public default void talk() {
        System.out.println("Говорить!");
    }
}
