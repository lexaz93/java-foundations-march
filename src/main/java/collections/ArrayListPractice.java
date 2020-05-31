package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);

        System.out.println("myList.get(0) = " + myList.get(0));

        myList.add(0, 2);

        System.out.println("myList.get(0) = " + myList.get(0));

        myList.add(0, 7);
        myList.add(1, -1);

        //0 1 2 3
        //7 -1 2 1
        System.out.print("MyList{ ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println("}");

        System.out.print("MyList{ ");
        for (Integer element : myList) {
            System.out.print(element + " ");
        }
        System.out.println("}");

        System.out.println("myList.contains(3) = " + myList.contains(3)); //Проверка на существование элемента 3
        if (myList.contains(2) ) {
            System.out.println("Элемент 3 существует");
        } else {
            System.out.println("Элемент 3 не существует");
        }

        myList.remove(0);
        System.out.print("MyList after removig 0th element { ");
        for (Integer element : myList) {
            System.out.print(element + " ");
        }
        System.out.println("}");

        myList.remove(Integer.valueOf(2));
        printList(myList);

        myList.add(1);
        myList.add(1);
        myList.add(1);

        System.out.print("MyList after adding 3 elements of 1 { ");
        for (Integer element : myList) {
            System.out.print(element + " ");
        }
        System.out.println("}");

        System.out.println("myList.indexOf(1) = " + myList.indexOf(1));
        System.out.println("myList.lastIndexOf(1) = " + myList.lastIndexOf(1));

        myList.set(1, 5);
        printList(myList);

        myList.set(myList.size()-1, 10);
        printList(myList);
        myList.remove(1);
        printList(myList);

//        myList.clear();
//        printList(myList);




    }

    public static void printList(List<Integer> myList) {
        System.out.print("MyList { ");
        for (Integer element : myList) {
            System.out.print(element + " ");
        }
        System.out.println("}");
    }

}
