package streams.functional_interfaces;

public class FuncInterfaceImpl implements FuncInterface{

    @Override
    public void hello(String input) {
        System.out.println("Hello" + input);
    }
}
