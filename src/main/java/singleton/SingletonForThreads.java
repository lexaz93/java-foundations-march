package singleton;

public class SingletonForThreads {
    private SingletonForThreads() {
    }

    public static class SingletonHolder { //для многопоточного
        public static final SingletonForThreads HOLDER_INSTANCE = new SingletonForThreads();
    }

    public static SingletonForThreads getInstance() {
        return SingletonHolder.HOLDER_INSTANCE; //обьект инициализируется при первом вызове метода
    }

}
