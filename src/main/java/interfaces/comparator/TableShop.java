package interfaces.comparator;


import interfaces.Dog;

import java.util.Arrays;

public class TableShop {
    public static void main(String[] args) {
        Table woodTable = new Table(0.5, 1.0, 0.5, "wood");
        Table metalTable = new Table(0.5, 0.5, 0.5, "metal");
        Table plasticTable = new Table(1.0, 1.0, 1.0, "plastic");

        Table[] tables = new Table[]{woodTable, metalTable, plasticTable};

        Arrays.sort(tables);

        System.out.println(Arrays.toString(tables));

//        System.out.println(plasticTable.compareTo(new Dog()));


    }
}
