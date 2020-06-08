package collections.my_lists.linked_list_2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data //setter + getter
public class Node<T> {
    private Node<T> previous;
    private T element;
    private Node<T> next;
}
