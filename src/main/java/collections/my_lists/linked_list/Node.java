package collections.my_lists.linked_list;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data //setter + getter
public class Node {
    private Object element;
    private Node next;
}
