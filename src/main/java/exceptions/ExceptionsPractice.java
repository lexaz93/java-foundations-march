package exceptions;

import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsPractice {
    public static void main(String[] args) {
//        throw new RuntimeException("Hola");
//        try {
//            throw new Exception("Hola, Exception!");
//        } catch (Exception e) {
//            System.out.println("catch " + e.getMessage());
//        }

//        try {
//            exceptMethod();
//        } catch (Exception e) {
//            System.out.println("catch " + e.getMessage());
//        }

//        exceptMethodSneakyThrows();
//
//        try {
//            System.out.println("1");
//            exceptMethod();
//            System.out.println("2");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }catch (IOException e) {
//            System.err.println("IO");
//        }catch (Exception e) {
//            System.err.println("Exc");
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally");
//        }
//
//    }
        Child marussia = null;
        try {
            marussia = new Child("Marussia", -10);
        } catch (MyException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

        System.out.println(marussia);
    }

    public static void exceptMethod() throws Exception {
        throw new Exception("Hola, Exception!");
    }

    @SneakyThrows
    public static void exceptMethodSneakyThrows() {
        throw new Exception("Hola, Exception!");
    }
}
