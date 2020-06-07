package collections.my_lists.linked_list;

import lombok.Data;

@Data
public class MyLinkedList {
    private Node startNode;
    private int size;

    public MyLinkedList(Object obj) {
        startNode = new Node(obj, null);
        size = 1;
    }

    public MyLinkedList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        Node cur = startNode;
        for (int i = 0; i < size; i++) {
            if (o.equals(cur.getElement())) {
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    public boolean add(Object o) {
        if (startNode == null) {
            startNode = new Node(o, null);
        } else {
// 1.
//            Node node = startNode;
//            for (int i = 0; i < size - 1; i++) {
//                node = node.getNext();
//            }
//            node.setNext(new Node(o, null));
//2.
//            Node cur;
//            for (cur = startNode; cur.getNext() != null; cur = cur.getNext()) {
//            }
//            cur.setNext(new Node(o, null));
//3.
            Node cur = startNode;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(new Node(o, null));


        }
        size++;
        return true;
    }

    public boolean remove(Object o) {
        if (size == 0 || o == null) {
            return false;
        }
        if (o.equals(startNode.getElement())) {
            if (startNode.getNext() != null) {
                startNode = startNode.getNext();
            } else {
                startNode = null;
            }
            size--;
            return true;
        }
        if (size > 1) {
            Node prevNode = startNode;
            Node curNode = startNode.getNext();
            for (int i = 0; i < size - 1; i++) {
                if (o.equals(curNode.getElement())) {
                    prevNode.setNext(curNode.getNext());
                    curNode.setNext(null);
                    size--;
                    return true;
                }
                prevNode = curNode;
                curNode = curNode.getNext();
            }
        }
        return false;
    }

    public void clear() {
        Node prevNode = startNode;
        Node curNode = startNode.getNext();
        for (int i = 0; i < size - 1; i++) {
            prevNode.setNext(null);
            prevNode = curNode;
            curNode = curNode.getNext();

        }
        size = 0;
        System.out.println("MyList is cleaned");
    }

    public Object get(int index) {
        checkIndex(index);
        Node curNode = startNode;
        for (int i = 0; i < index; i++) {
            curNode = curNode.getNext();
        }
        return curNode.getElement();
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            System.err.println("Введите корректный индекс");
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        Node curNode = startNode;
        for (int i = 0; i < index; i++) {
            curNode = curNode.getNext();
        }
        curNode.setElement(element);
        return curNode.getElement();
    }

    public void add(int index, Object element) {
        checkIndex(index);
        Node node = startNode;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNext();
        }
        node.setNext(new Node(element, node.getNext()));
        size++;
    }

    public Object remove(int index) {
        checkIndex(index);
//        1.Вариант
//        Node prevNode = startNode;
//        Node curNode = startNode.getNext();
//        for (int i = 0; i < index - 1; i++) {
//            prevNode = curNode;
//            curNode = curNode.getNext();
//        }
//        prevNode.setNext(curNode.getNext());
        Node node = startNode;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNext();
        }
        node.setNext((node.getNext().getNext()));
        size--;
        return true;
    }

    public int indexOf(Object o) {
        Node node = startNode;
        for (int i = 0; i < size; i++) {
            if (o.equals(node.getElement())) {
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        int count = -1;
        Node node = startNode;
        for (int i = 0; i < size; i++) {
            if (o.equals(node.getElement())) {
                count = i;
            }
            node = node.getNext();
        }
        return count;
    }

    public MyLinkedList subList(int fromIndex, int toIndex) {
        checkIndex(fromIndex);
        checkIndex(toIndex);
        Node node = startNode;
        for (int i = 0; i < fromIndex; i++) {
            node = node.getNext();
        }
        MyLinkedList linkedList = new MyLinkedList(node.getElement());
        Node linkedListNode = linkedList.startNode;
        for (int i = 0; i < toIndex - fromIndex - 1; i++) { //последний не включаем, также как в arrayList
            linkedListNode.setNext(node.getNext());
            linkedListNode = linkedListNode.getNext();
            node = node.getNext();
            linkedList.size++;
        }
        return linkedList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyLinkedList { ");
        Node curNode = startNode;
        for (int i = 0; i < size; i++) {
            sb.append(curNode.getElement()).append(' ');
            curNode = curNode.getNext();
        }
        sb.append('}');
        return sb.toString();
    }

}
