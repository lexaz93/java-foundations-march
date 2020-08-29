package annotations.myjunit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestingMethods {
    public static void testingGeneral(Class<?> testFromObject, SomethingTest test) {
        for (Method method : testFromObject.getMethods()) {
            try {
                if (method.isAnnotationPresent(Test.class) &&
                        !method.isAnnotationPresent(Before.class) &&
                        !method.isAnnotationPresent(After.class) &&
                        !method.isAnnotationPresent(BeforeEach.class) &&
                        !method.isAnnotationPresent(AfterEach.class)) {
                    method.invoke(test);
                    testing(testFromObject, test, BeforeEach.class);
                    System.out.println(method.getName() + " успешно прошел");
                    testing(testFromObject, test, AfterEach.class);
                }
            } catch (Throwable e) {
                testing(testFromObject, test, BeforeEach.class);
                System.err.println(method.getName() + " успешно упал");
                testing(testFromObject, test, AfterEach.class);

            }
        }
    }

    public static void testing(Class<?> testFromObject, SomethingTest test, Class<? extends Annotation> annotationClass) {
        for (Method method : testFromObject.getMethods()) {
            try {
                if (method.isAnnotationPresent(annotationClass)) {
                    method.invoke(test);
                    System.out.println(method.getName() + " успешно прошел");
                }
            } catch (Throwable e) {
                System.err.println(method.getName() + " успешно упал");
            }
        }
    }

    public static void displayNameTesting(Class<?> testFromObject, SomethingTest test) {
        for (Method method : testFromObject.getMethods()) {
            try {
                if (method.isAnnotationPresent(Test.class) && method.isAnnotationPresent(DisplayName.class)) {
                    method.invoke(test);
                    System.out.println(method.getAnnotation(DisplayName.class).string());
                }
            } catch (Throwable ignored) {
            }
        }
    }
}
