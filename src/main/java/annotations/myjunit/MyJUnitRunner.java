package annotations.myjunit;

public class MyJUnitRunner {

    public static void main(String[] args) throws ClassNotFoundException {
        SomethingTest test = new SomethingTest();
        final Class<?> testClazz = Class.forName("annotations.myjunit.SomethingTest");

        TestingMethods.testing(testClazz, test, Before.class);

       TestingMethods.testingGeneral(testClazz, test);

        TestingMethods.testing(testClazz, test, After.class);

        TestingMethods.displayNameTesting(testClazz, test);

    }
}
