package exceptions.hw_exeptions;

public class HWExceptions {
    public static void main(String[] args) {
        try {
            try {
                throw new MyException("Моё исключение!");
            } catch (MyException e) {
                System.err.println(e.getMessage());
                throw e;
            } finally {
                System.out.println("Блок кода который выполняется в любом случае!");
            }
        } catch (MyException e) {
            System.err.println(e.getMessage() + " 2");
        } finally {
            System.out.println("Блок кода который выполняется в любом случае - 2!");
            try {
                Person alex = new Person("Alex", -1);
            }
            catch (MyRuntimeException e) {
                System.err.println(e.getMessage());
            }
        }


    }
}
