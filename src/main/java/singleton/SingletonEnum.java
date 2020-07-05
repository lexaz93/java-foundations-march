package singleton;

public enum SingletonEnum {
    INSTANCE;
    private SingletonEnum() {   //неявный конструктор
        System.out.println("Here");
    }
}
// при вызове System.out.println(MySingleton.INSTANCE) - будем видеть:
// Here
//INSTANCE