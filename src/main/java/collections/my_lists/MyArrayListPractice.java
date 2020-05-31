package collections.my_lists;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add("A1");
        myList.add("A2");
        myList.add("A3");
        myList.add("A4");
        myList.add("A5");
        myList.add("A6");
        myList.add("A7");
        myList.add("A8");
        myList.add("A9");
        myList.add("A10");
        myList.add("A11");
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.get(10));
        System.out.println(myList.subList(1, 3));
        System.out.println(myList.contains("A2"));
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.remove("A2"));
        System.out.println(myList.size());
        System.out.println(myList);
//        myList.clear();
//        System.out.println(myList);
        myList.add(0,"A");
        myList.add(2,"A2");
        System.out.println(myList);
        myList.remove(11);
        myList.remove(1);
        System.out.println(myList);
        System.out.println("myList.contains(\"A7\") = " + myList.contains("A7"));
        System.out.println("myList.indexOf(\"A7\") = " + myList.indexOf("A7"));
        System.out.println("myList.indexOf(\"A1\") = " + myList.indexOf("A1"));
        myList.add(3, "A6");
        System.out.println(myList);
        System.out.println("myList.lastIndexOf(\"A6\") = " + myList.lastIndexOf("A6"));


    }
}
