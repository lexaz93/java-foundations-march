package collections.my_lists.linked_list;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("linkedList.size() = " + linkedList.size());

        linkedList.add("Vitaliy");
        linkedList.add("Alex");
        linkedList.add("Yura");
        linkedList.add("George");
        System.out.println("linkedList.toString() = " + linkedList.toString());



        System.out.println("linkedList.get(2) = " + linkedList.get(2));

//        linkedList.remove("Vitaliy");
//        System.out.println("linkedList.toString() After remove = " + linkedList.toString());
//        linkedList.remove("Yura");
//        System.out.println("linkedList.toString() After remove = " + linkedList.toString());
//        linkedList.remove("Alex");
//        System.out.println("linkedList.toString() After remove = " + linkedList.toString());
//        linkedList.remove("George");
//        System.out.println("linkedList.toString() After remove = " + linkedList.toString());
//        linkedList.remove("Geore");

        System.out.println(linkedList.toString());
//        linkedList.clear();
////        System.out.println(linkedList.toString());
        linkedList.add(2, "Yulia");
        System.out.println(linkedList.toString());
        linkedList.remove(2);
        System.out.println(linkedList.toString());
        System.out.println(linkedList.subList(0, 3));


    }

}
