package collections.my_lists.linked_list_2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data //setter + getter
public class Node {
    private Node previous;
    private Object element;
    private Node next;
}
