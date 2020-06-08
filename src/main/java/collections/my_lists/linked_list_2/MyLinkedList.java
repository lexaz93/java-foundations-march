package collections.my_lists.linked_list_2;

import lombok.Data;

@Data
public class MyLinkedList<T> {
    private Node<T> startNode;
    private Node<T> lastNode;
    private int size;

    public MyLinkedList(T obj) {
        startNode = lastNode = new Node<>(null, obj, null);
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

    public boolean contains(T o) {
        Node<T> cur = startNode;
        Node<T> cur2 = lastNode;
        for (int i = 0; i <= size / 2; i++) {
            if (o.equals(cur.getElement())) {
                return true;
            }
            cur = cur.getNext();
            if (o.equals(cur2.getElement())) {
                return true;
            }
            cur2 = cur2.getPrevious();
        }
        return false;
    }

    public boolean add(T o) {
        if (startNode == null) {
            startNode = new Node<>(null, o, null);
        } else {
            Node<T> cur = startNode;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(new Node<>(cur, o, null));
            lastNode = cur.getNext();


        }
        size++;
        return true;
    }

    public boolean remove(T o) {
        if (size == 0 || o == null) {
            return false;
        }
        if (o.equals(startNode.getElement())) {
            if (startNode.getNext() != null) {
                startNode = startNode.getNext();
                startNode.setPrevious(null);
            } else {
                startNode = null;
            }
            size--;
            return true;
        }
        if (o.equals(lastNode.getElement())) {
            lastNode = lastNode.getPrevious();
            lastNode.setNext(null);
            size--;
            return true;
        }
        if (size > 1) {
            Node<T> prevNode = startNode;
            Node<T> curNode = startNode.getNext();
            Node<T> nextNode = lastNode;
            Node<T> cur2Node = lastNode.getPrevious();
            for (int i = 0; i < size / 2; i++) {
                if (o.equals(curNode.getElement())) {
                    prevNode.setNext(curNode.getNext());
                    curNode.setNext(null);
                    curNode.setPrevious(null);
                    curNode.setElement(null);
                    size--;
                    return true;
                }
                prevNode = curNode;
                curNode = curNode.getNext();
                if (o.equals(cur2Node.getElement())) {
                    nextNode.setPrevious(cur2Node.getPrevious());
                    cur2Node.setNext(null);
                    cur2Node.setPrevious(null);
                    cur2Node.setElement(null);
                    size--;
                    return true;
                }
                nextNode = cur2Node;
                cur2Node = cur2Node.getPrevious();
            }
        }
        return false;
    }

    public void clear() {
        Node<T> prevNode = startNode;
        Node<T> curNode = startNode.getNext();
        Node<T> nextNode = lastNode;
        Node<T> cur2Node = lastNode.getPrevious();
        for (int i = 0; i <= size / 2; i++) {
            prevNode.setNext(null);
            prevNode = curNode;
            curNode = curNode.getNext();
            nextNode.setPrevious(null);
            nextNode = cur2Node;
            cur2Node = cur2Node.getPrevious();

        }
        size = 0;
        System.out.println("MyList is cleaned");
    }

    public T get(int index) {
        checkIndex(index);
        Node<T> curNode = startNode;
        Node<T> cur2Node = lastNode;
        if (index <= size / 2) {
            for (int i = 0; i < index; i++) {
                curNode = curNode.getNext();
            }
            return curNode.getElement();
        } else {
            for (int i = size - 1; i > index; i--) {
                cur2Node = cur2Node.getPrevious();
            }
            return cur2Node.getElement();
        }
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            System.err.println("Введите корректный индекс");
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public T set(int index, T element) {
        checkIndex(index);
        Node<T> curNode = startNode;
        Node<T> cur2Node = lastNode;
        if (index <= size / 2) {
            for (int i = 0; i < index; i++) {
                curNode = curNode.getNext();
            }
            curNode.setElement(element);
            return curNode.getElement();
        } else {
            for (int i = size - 1; i > index; i--) {
                cur2Node = cur2Node.getPrevious();
            }
            cur2Node.setElement(element);
            return cur2Node.getElement();
        }
    }

    public void add(int index, T element) {
        checkIndex(index);
        Node<T> node = startNode;
        Node<T> node2 = lastNode;
        if (index <= size / 2) {
            if (index == 0) {
                startNode = new Node<>(null, element, node);
            }
            for (int i = 0; i < index - 1; i++) {
                node = node.getNext();
            }
            node.setNext(new Node<>(node, element, node.getNext()));
        } else {
            for (int i = size - 1; i > index - 1; i--) {
                node2 = node2.getPrevious();
            }
            node2.setNext(new Node<>(node2, element, node2.getNext()));
        }


        size++;
    }

    public boolean remove(int index) {
        checkIndex(index);
        Node<T> node = startNode;
        Node<T> node2 = lastNode;
        if (index <= size / 2) {
            if (index == 0) {
                startNode.setElement(null);
                startNode = new Node<>(null, node.getNext().getElement(), node.getNext().getNext());
                startNode.setPrevious(null);
            }
            for (int i = 0; i < index - 1; i++) {
                node = node.getNext();
            }
            node.getNext().setElement(null);
            node.setNext((node.getNext().getNext()));
            node.getNext().setPrevious(node);

        } else if (index == size - 1) {
            node2 = node2.getPrevious();
            lastNode.setElement(null);
            lastNode = new Node<>(node2.getPrevious(), node2.getElement(), null);

        } else {
            for (int i = size - 1; i > index; i--) {
                node2 = node2.getPrevious();
            }
            node2.getNext().setElement(null);
            node2.setNext((node2.getNext().getNext()));
            node2.getNext().setPrevious(node2);
        }
        size--;
        return true;
    }

    public int indexOf(T o) {
        Node<T> node = startNode;
        for (int i = 0; i < size; i++) {
            if (o.equals(node.getElement())) {
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }

    public int lastIndexOf(T o) {
        Node<T> node = lastNode;
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(node.getElement())) {
                return i;
            }
            node = node.getPrevious();
        }
        return -1;
    }

    public MyLinkedList<T> subList(int fromIndex, int toIndex) {
        checkIndex(fromIndex);
        checkIndex(toIndex);
        Node<T> node = startNode;
        for (int i = 0; i < fromIndex; i++) {
            node = node.getNext();
        }
        MyLinkedList<T> linkedList = new MyLinkedList<>(node.getElement());
        Node<T> linkedListNode = linkedList.startNode;
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
        Node<T> curNode = startNode;
        for (int i = 0; i < size; i++) {
            sb.append(curNode.getElement()).append(' ');
            curNode = curNode.getNext();
        }
        sb.append('}');
        return sb.toString();
    }

}
