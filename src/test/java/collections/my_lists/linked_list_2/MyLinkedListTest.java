package collections.my_lists.linked_list_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс MyLinkedList имеет:")
public class MyLinkedListTest {

    private final MyLinkedList<Object> list = new MyLinkedList<>();

    @Test
    @DisplayName("корректный метод add")
    public void shouldHaveCorrectMethodAdd() {
        String element = "element";
        list.add(element);
        assertEquals(element, list.get(0));

    }

    @Test
    @DisplayName("корректный метод add при добавлении большого количества элементов")
    public void shouldHaveCorrectMethodAddWithNewArray() {
        String element = "element";
        for (int i = 0; i < 11; i++) {
            list.add(element);
        }
        assertEquals(11, list.size());
    }

    @Test
    @DisplayName("корректный метод add по индексу")
    public void shouldHaveCorrectMethodAddByIndex() {
        String element = "element";
        String element2 = "element2";
        String element3 = "element3";
        list.add(element);
        list.add(element2);
        list.add(element2);
        list.add(2, element3);
        assertEquals(element3, list.get(2));

    }

    @Test
    @DisplayName("корректный метод add с граничными условиями")
    public void shouldHaveCorrectMethodAddByIndexOnBorder() {
        String element = "element";
        String element2 = "element2";
        String element3 = "element3";
        list.add(element);
        list.add(element2);
        list.add(element2);
        list.add(0, element3);
        assertEquals(element3, list.get(0));

    }

    @Test
    @DisplayName("корректный метод size")
    public void shouldHaveCorrectMethodSize() {
        assertEquals(0, list.size());
    }

    @Test
    @DisplayName("корректный метод size с большим количеством элементов")
    public void shouldHaveCorrectMethodSizeWithMoreElements() {
        for (int i = 0; i < 10; i++) {
            list.add("element");
        }
        assertEquals(10, list.size());
    }


    @Test
    @DisplayName("корректный метод indexOf для первого элемента")
    public void shouldHaveCorrectMethodIndexOf1() {
        list.add("element");
        list.add("actual");
        assertEquals(0, list.indexOf("element"));
    }

    @Test
    @DisplayName("корректный метод indexOf для второго элемента")
    public void shouldHaveCorrectMethodIndexOf2() {
        list.add("element");
        list.add("actual");
        assertEquals(1, list.indexOf("actual"));
    }

    @Test
    @DisplayName("корректный метод indexOf для произвольного элемента")
    public void shouldHaveCorrectMethodIndexOfN() {
        list.add("element");
        list.add("actual");
        list.add("actua");
        list.add("actu");
        list.add("act");
        list.add("ac");
        list.add("a");
        int i = (int) (Math.random() * 10);
        list.add(i,"blabla");
        assertEquals(i, list.indexOf("blabla"));
    }

    @Test
    @DisplayName("корректный метод lastIndexOf")
    public void shoulsHaveCorrectMetodLastIndexOf() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Three");
        list.add("Four");
        assertEquals(4, list.lastIndexOf("Three"));
    }

    @Test
    @DisplayName("корректный метод isEmpty")
    public void shouldHaveCorrectMethodIsEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    @DisplayName("корректный метод contains")
    public void shouldHaveCorrectMethodContains() {
        list.add("One");
        list.add("Two");
        assertTrue(list.contains("Two"));
    }

    @Test
    @DisplayName("корректный метод get")
    public void shouldHaveCorrectMethodGet() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        assertEquals("Two", list.get(1));
    }

    @Test
    @DisplayName("корректный метод set")
    public void shouldHaveCorrectMethodSet() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.set(1, "Four");
        assertEquals("Four", list.get(1));
    }

    @Test
    @DisplayName("корректный метод clear")
    public void shouldHaveCorrectMethodClear() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    @DisplayName("корректный метод remove с уменьшением размера")
    public void shouldHaveCorrectMethodRemove() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.remove("Two");
        assertEquals(2, list.size());
    }

    @Test
    @DisplayName("корректный метод remove с отсутствием удаленного элемента")
    public void shouldHaveCorrectMethodRemove2() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.remove("Three");
        assertFalse(list.contains("Three"));
    }

    @Test
    @DisplayName("корректный метод remove по индексу со сдвигом влево оставшегося списка после удаления элемента")
    public void shouldHaveCorrectMethodIndexRemove() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.remove(1);
        assertEquals(1, list.indexOf("Three"));
    }

    @Test
    @DisplayName("корректный метод remove по индексу с отсутствием удаленного элемента")
    public void shouldHaveCorrectMethodIndexRemove2() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.remove(1);
        assertFalse(list.contains("Two"));
    }

    @Test
    @DisplayName("корректный метод subList")
    public void shoulsHaveCorrectMetodSubList() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        MyLinkedList<Object> sublist = list.subList(1, 5);
        assertEquals(4, sublist.size());
    }
}
