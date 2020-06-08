package collections.my_lists.linked_list_2;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        System.out.println("linkedList.size() = " + linkedList.size());

        linkedList.add("Vitaliy");
        linkedList.add("Alex");
        linkedList.add("Yura");
        linkedList.add("George");
        System.out.println("linkedList.toString() = " + linkedList.toString());
//        System.out.println(linkedList.getLastNode().getElement());
//
//
//        System.out.println("linkedList.get(2) = " + linkedList.get(2));
//        System.out.println("linkedList.get(3) = " + linkedList.get(3));

//        linkedList.remove("Vitaliy");
//        System.out.println("linkedList.toString() After remove = " + linkedList.toString());
//        linkedList.remove("Yura");
//        System.out.println("linkedList.toString() After remove = " + linkedList.toString());
//
//        linkedList.remove("George");
//        System.out.println("linkedList.toString() After remove = " + linkedList.toString());
//        linkedList.remove("Alex");
//        System.out.println("linkedList.toString() After remove = " + linkedList.toString());
//        linkedList.remove("Geore");

//        System.out.println(linkedList.toString());
//        linkedList.clear();
//        System.out.println(linkedList.toString());
//        linkedList.add(3, "Yulia");
//        System.out.println(linkedList.toString());
        linkedList.remove(3);
        System.out.println(linkedList.toString());
//        System.out.println(linkedList.subList(0, 3));
//        linkedList.add("One");
//        linkedList.add("Two");
//        linkedList.add("Three");
//        System.out.println(linkedList.toString());
//        linkedList.remove("Two");
//        System.out.println(linkedList.toString());
//        System.out.println("linkedList.contains(\"Two\") = " + linkedList.contains("Two"));
//        System.out.println("linkedList.indexOf(\"Two\") = " + linkedList.indexOf("Two"));


    }

}
