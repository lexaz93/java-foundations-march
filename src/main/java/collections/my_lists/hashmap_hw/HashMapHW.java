package collections.my_lists.hashmap_hw;

import collections.my_lists.map.Human;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapHW {
    public static void main(String[] args) {
        Human frenchman = new Human("D'artanian", 33);
        Human englishman = new Human("David Bechham", 45);
        Human russianman = new Human("Vladimir Putin", 67);

        Fruits melon = new Fruits("Дыня", 4.5);
        Fruits watermelon = new Fruits("Арбуз", 6.7);
        Fruits orange = new Fruits("Апельсин", 0.5);

        Map<Human, Fruits> humanFruitsMap = new HashMap<>();
        humanFruitsMap.put(frenchman, melon);
        humanFruitsMap.put(englishman, watermelon);
        humanFruitsMap.put(russianman, orange);

        System.out.println();
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            System.out.println(pair.getKey().getName() + ": " + pair.getValue());
        }
        System.out.println();

        System.out.println("humanFruitsMap.get(russianman) = " + humanFruitsMap.get(russianman));

        Human ukraineman = new Human("Olezhko", 38);
        Human armeniaman = new Human("Genrih Mkrtchyan", 45);
        Human uzbekistanman = new Human("Urukbek", 25);
        Human blackman = new Human("Black Star", 39);
        Human chiniseman = new Human("Kon Fu Ciu", 100500);

        Fruits apricot = new Fruits("Абрикос", 0.15);
        Fruits grape = new Fruits("Виноград", 0.3);
        Fruits persimmon = new Fruits("Хурма", 0.2);
        Fruits banana = new Fruits("Банан", 0.5);
        Fruits artificialFruit = new Fruits("ИскуственныйФрукт", 1.5);

        humanFruitsMap.put(ukraineman, apricot);
        humanFruitsMap.put(armeniaman, grape);
        humanFruitsMap.put(uzbekistanman, persimmon);
        humanFruitsMap.put(blackman, banana);
        humanFruitsMap.put(chiniseman, artificialFruit);

        System.out.println();
        for (Human human : humanFruitsMap.keySet()) {
            System.out.println(human.getName() + " " + humanFruitsMap.get(human));
        }
        System.out.println();

        Map<Human, Fruits> humanFruitsMap2 = new HashMap<>();
        humanFruitsMap2.putAll(humanFruitsMap);

        Iterator<Map.Entry<Human, Fruits>> iterator = humanFruitsMap2.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Human, Fruits> pair = iterator.next();
            System.out.println(pair.getKey().getName() + " - " + pair.getValue());
        }

        System.out.println();
        System.out.println("humanFruitsMap.remove(ukraineman) = " + humanFruitsMap.remove(ukraineman));

        System.out.println();
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            System.out.println(pair.getKey().getName() + ": " + pair.getValue());
        }
        System.out.println();

        System.out.println("humanFruitsMap.containsValue(melon) = " + humanFruitsMap.containsValue(melon));
        System.out.println("humanFruitsMap.containsKey(ukraineman) = " + humanFruitsMap.containsKey(ukraineman));

        System.out.println("\nВсе покупатели:");
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            System.out.print(pair.getKey().getName() + " ");
        }
        System.out.println();

        System.out.println("\nВсе покупки:");
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            System.out.print(pair.getValue() + " ");
        }
        System.out.println();

        System.out.println("\nПокупатели с покупками:");
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            System.out.println(pair.getKey().getName() + ": " + pair.getValue());
        }
        System.out.println();

        System.out.println("\nПокупатели с именами больше 10:");
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            if (pair.getKey().getName().length() > 10) {
                System.out.print(pair.getKey().getName() + " ");
            }
        }
        System.out.println();

        humanFruitsMap.put(ukraineman, melon);

        System.out.println("\nПокупатели с покупками дыни:");
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            if (pair.getValue().getName().equals("Дыня")) {
                System.out.print(pair.getKey().getName() + " ");
            }
        }
        System.out.println();

        humanFruitsMap.remove(ukraineman);
        humanFruitsMap.remove(uzbekistanman);
        humanFruitsMap.remove(armeniaman);

        humanFruitsMap.put(ukraineman, watermelon);
        humanFruitsMap.put(uzbekistanman, watermelon);
        humanFruitsMap.put(armeniaman, watermelon);

        System.out.println("\nПокупатели с покупками азбуза, с третьего:");
        int count = 0;
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            if (pair.getValue().getName().equals("Арбуз")) {
                count++;
                if (count > 2) {
                    System.out.print(pair.getKey().getName() + " ");
                }
            }
        }
        System.out.println();

        System.out.println("\nПокупатели с покупками на А, с третьего:");
        int count1 = 0;
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            if (pair.getValue().getName().charAt(0) == 'А' || pair.getValue().getName().charAt(0) == 'а') {
                count1++;
                if (count1 > 2) {
                    System.out.print(pair.getKey().getName() + " ");
                }
            }
        }
        System.out.println();

        System.out.println("\nПервый покупатель азбуза:");
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("Арбуз")) {
                System.out.print(pair.getKey().getName());
                break;
            }
        }
        System.out.println();

        Map<Human, Fruits> humanFruitsMap3 = new HashMap<>();
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            if (pair.getValue().getClass() == Fruits.class) {
                humanFruitsMap3.put(pair.getKey(), pair.getValue());
            }
        }

        System.out.println();
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap3.entrySet()) {
            System.out.println(pair.getKey().getName() + ": " + pair.getValue());
        }
        System.out.println();

        double sum = 0;
        for (Map.Entry<Human, Fruits> pair : humanFruitsMap.entrySet()) {
            sum += pair.getValue().getWeight();
        }

        System.out.println("Средний вес фруктов: " + sum / humanFruitsMap.size() + " кг.");

    }
}
