package extraHW;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExtraHW {
    public static void main(String[] args) {
        Stack stack = new Stack(); //last in - first out
        Queue queue = new LinkedList(); //first in - first out (Queue - is interface)

        for (int i = 0; i < 5; i++) {
            stack.add(i);
        }

        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }

        System.out.println("stack.toString() = " + stack.toString());
        System.out.println("queue.toString() = " + queue.toString());

        System.out.println("stack.peek() = " + stack.peek()); //return first element
        System.out.println("queue.peek() = " + queue.peek()); //return first element


    }




}
