package collections.my_lists.map;

import collections.my_lists.set.Glass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Human frenchman = new Human("D'artanian", 33);
        Human englishman = new Human("David Bechham", 45);
        Human russianman = new Human("Vladimir Putin", 67);

        Glass wineglass = new Glass("glass", 350.0);
        Glass beerGlass = new Glass("metal", 500);
        Glass waterGlass = new Glass("граненое стекло", 200);

        Map<Human, Glass> humanGlassMap = new HashMap<>();
        humanGlassMap.put(frenchman, wineglass);
        humanGlassMap.put(englishman, beerGlass);
        humanGlassMap.put(russianman, waterGlass);

        for (Map.Entry<Human, Glass> pair : humanGlassMap.entrySet()) {
            System.out.println(pair.getKey().getName() + ": " + pair.getValue());
        }
        System.out.println();

        for (Human human : humanGlassMap.keySet()) {
            System.out.println(human.getName() + " " + humanGlassMap.get(human));
        }
        System.out.println();

        Iterator<Map.Entry<Human,Glass>> iterator = humanGlassMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Human, Glass> pair = iterator.next();
            System.out.println(pair.getKey().getName() + " - " + pair.getValue());
        }
    }
}
