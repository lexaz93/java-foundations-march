package interfaces.extraHW;

public interface Talkable {
    default void talk() {
        System.out.println("Говорить!");
    }
}
