package annotations.myjunit;

import java.lang.reflect.Method;

public class MyJUnitRunner {

    public static void main(String[] args) throws ClassNotFoundException {
        int countPassed = 0;
        int countFailed = 0;
        SomethingTest test = new SomethingTest();
        final Class<?> testClazz = Class.forName("annotations.myjunit.SomethingTest");
        for (Method method : testClazz.getMethods()) {
            try {
                if (method.isAnnotationPresent(Test.class)) {
                    method.invoke(new SomethingTest());
                    countPassed++;
                    System.out.println(method.getName() + " успешно прошел");
                }
            } catch (Throwable e) {
                countFailed++;
                System.err.println(method.getName() + " успешно упал");
            }
        }

        System.out.println("-------------------------------" +
                "\nКоличество упавших тестов " + countFailed +
                "\nКоличество пройденных тестов " + countPassed +
                "\n-------------------------------");
    }
}
