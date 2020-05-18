package interfaces.extraHW;

public interface Eatable {
    default void eat(){
        System.out.println("Кушать!");
    }
}
