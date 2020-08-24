package collections.my_lists.hashmap_hw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHW {
    public static void main(String[] args) {
        Set<Fruits> fruits = new HashSet<>();

        Fruits melon = new Fruits("Дыня", 4.5);
        Fruits watermelon = new Fruits("Арбуз", 6.7);
        Fruits orange = new Fruits("Апельсин", 0.5);

        System.out.println("fruits.add(melon) = " + fruits.add(melon));
        System.out.println("fruits.add(watermelon) = " + fruits.add(watermelon));
        System.out.println("fruits.add(orange) = " + fruits.add(orange));
        System.out.println("fruits.add(orange) = " + fruits.add(orange));
        System.out.println("fruits.remove(watermelon) = " + fruits.remove(watermelon));
        System.out.println("fruits.contains(watermelon) = " + fruits.contains(watermelon));

        Iterator<Fruits> iterator = fruits.iterator();
        System.out.println("Мои фрукты:");
        fruits.stream().map(Fruits::getName).forEach(System.out::println);
//        while (iterator.hasNext()) {
//            Fruits fruit = iterator.next();
//            System.out.print(fruit.getName() + " ");
//        }
        System.out.println();

    }
}
