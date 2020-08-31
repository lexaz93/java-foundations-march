package annotations.myjunit;

public class MyJUnitRunner {

    public static void main(String[] args) throws ClassNotFoundException {
        SomethingTest test = new SomethingTest();

        TestingMethods.testingAll(test);

    }
}
