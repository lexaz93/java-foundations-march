package streams.functional_interfaces;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        FuncInterface funcInterface = (input) -> System.out.println("Hello " + input);
        funcInterface.hello("Alex");

        Predicate<Integer> predicate = i -> i < 0;  //lambda
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(-4));
        System.out.println(predicate.test(0));

        Supplier<String> supplier = () -> "Ola";
        System.out.println(supplier.get());

        Consumer<String> consumer = (input) -> System.out.println(input);
        consumer.accept("Alex");

        Function<Integer, Integer> function = (input) -> input * input;
        System.out.println(function.apply(5));

        Integer integer = null;
        Optional.ofNullable(integer).ifPresent(System.out::println); //of Nullable - may contain null

        System.out.println(Optional.ofNullable(integer).orElse(6));
    }
}
