package annotations.myjunit;


public class SomethingTest {
    @Test
    public void method1() {
        throw new RuntimeException();
    }

    @Test
    public void method2() throws Exception {
        throw new Exception("method2");
    }

    @Test
    public void method3() {

    }

    @Test
    public void method4() {

    }

    @Test
    public void method5() {

    }

    @Test
    public void method6() {
        throw new RuntimeException("method6");
    }


}
