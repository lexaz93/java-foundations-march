package interfaces.extraHW;

public interface Eatable {
    public default void eat(){
        System.out.println("Кушать!");
    }
}
