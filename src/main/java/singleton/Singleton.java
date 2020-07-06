package singleton;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {   //для одного потока
        if (INSTANCE == null) {
            INSTANCE = new Singleton(); //один раз создается
        }
        return INSTANCE;
    }

}
