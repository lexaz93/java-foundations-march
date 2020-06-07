package collections.my_lists.array_list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Класс MyArrayList имеет:")
public class MyArrayListTest {

    private final MyArrayList list = new MyArrayList();

    @Test
    @DisplayName("корректный метод add")
    public void shouldHaveCorrectMethodAdd() {
        String element = "element";
        list.add(element);
        assertEquals(element, list.get(0));

    }

    @Test
    @DisplayName("корректный метод size")
    public void shouldHaveCorrectMethodSize() {
        assertEquals(0, list.size());
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
    @DisplayName("корректный метод remove")
    public void shouldHaveCorrectMethodRemove() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.remove("Two");
        assertEquals(2, list.size());
    }

    @Test
    @DisplayName("корректный метод remove по индексу")
    public void shouldHaveCorrectMethodIndexRemove() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.remove(1);
        assertEquals(1, list.indexOf("Three"));
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
    @DisplayName("корректный метод subList")
    public void shoulsHaveCorrectMetodSubList() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        MyArrayList sublist = list.subList(1,5);
        assertEquals(4, sublist.size());
    }
}
