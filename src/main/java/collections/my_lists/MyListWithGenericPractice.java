package collections.my_lists;

public class MyListWithGenericPractice  {
    public static void main(String[] args) {
        MyListWithGeneric<Integer> myList = new MyListWithGeneric<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);
        myList.add(11);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.get(10));
        System.out.println(myList.subList(1, 3));
        System.out.println(myList.contains(2));
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.remove(2));
        System.out.println(myList.size());
        System.out.println(myList);
//        myList.clear();
//        System.out.println(myList);
        myList.add(0,0);
        myList.add(2,2);
        System.out.println(myList);
        myList.remove(11);
        myList.remove(1);
        System.out.println(myList);
        System.out.println("myList.contains(7) = " + myList.contains(7));
        System.out.println("myList.indexOf(7) = " + myList.indexOf(7));
        System.out.println("myList.indexOf(1) = " + myList.indexOf(1));
        myList.add(3, 6);
        System.out.println(myList);
        System.out.println("myList.lastIndexOf(6) = " + myList.lastIndexOf(6));


    }
}

