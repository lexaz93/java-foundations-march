package collections.my_lists.set;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<Glass> glassSet = new HashSet<>();

        Glass wineglass = new Glass("glass", 350.0);
        Glass wineglass2 = new Glass("glass", 350.0);
        Glass beerGlass = new Glass("metal", 500.0);

        System.out.println(glassSet.add(wineglass));
        System.out.println(glassSet.add(beerGlass));
        System.out.println(glassSet.add(wineglass2));

        for (Glass itemGlass : glassSet) {
            System.out.print(itemGlass + " ");
        }
        System.out.println("\nglassSet.size() = " + glassSet.size());
    }
}
