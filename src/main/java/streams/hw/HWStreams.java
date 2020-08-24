package streams.hw;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class HWStreams {
    public static void main(String[] args) throws IOException {
        Path textFile1 = Paths.get("src/main/resources/text1.txt");
        try (PrintWriter printWriter = new PrintWriter(textFile1.toFile())) {
            printWriter.println("Hello, first string in file!");
            printWriter.println("Hello, second string in file!");
            printWriter.println("Hello, third string in file!");
            printWriter.flush();
        }

        System.out.println(Files.lines(textFile1).collect(Collectors.toList()));//файл в поток, поток в лист


        System.out.println(Files.lines(textFile1).reduce((left, right) -> left + " (^^,) " + right));//сокращение элементов с помошью функции

        List<Integer> numbers = asList(1, 2, 3, 4);

        Optional<Integer> sum = numbers.stream()
                .reduce((left, right) -> left + right); //сумма
        sum.ifPresent(System.out::println);

        Integer sum2 = numbers.stream()
                .reduce(12, Integer::sum); //сумма начиная с 12

        System.out.println(sum2);


        List<Integer> integers = asList(1, 2, 3, 4, 5);
        Integer sum3 = integers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum3); //промежуточная операция mapToInt () , которая преобразует наш поток в объект IntStream, принимает преобразователь в качестве параметра, а далее sum()


        System.out.println("Fibonacci:");
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}) // инициализация и  итерация
                .limit(10)
                .map(n -> n[0]) //функция
                .forEach(System.out::println); //sout к каждому приходящему значению


        List<Human> humans = asList(
                new Human("Sultan", asList("Zulfiya", "Multa")),
                new Human("Han", asList("Altin", "Zara")),
                new Human("Tsar", asList("Marfa")));
        List<String> wifeNames = humans.stream()
                .flatMap(human -> human.getWifes().stream()) //преобразовываем Stream<Human> в Stream<List<Pet>> и "разворачиваем" Stream<List<Pet>> в Stream<Pet>
                .collect(Collectors.toList());
        //операция map создает одно выходное значение для каждого входного значения, тогда как операция flatMap создает произвольное число(ноль или больше) значений для каждого входного значения
        System.out.println(wifeNames);







    }
}
