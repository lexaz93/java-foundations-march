package collections.my_lists.array_list;

@SuppressWarnings("unchecked")

public class MyListWithGeneric <T> {
    private T[] array; //скрытый массив (внутри аррайлист)
    private int size;//размер аррайлиста
    public static final int DEFAULT_CAPACITY = 10;

    public MyListWithGeneric() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    //0      1   2    3 ..  9  array.lenght
    //null null null null..null size

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T o) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                count++;
                break;
            }
        }
        return count != 0;
    }

    public boolean add(T o) {
        if (size >= array.length) {
            T[] resArray = (T[]) new Object[3 * 2 * size + 1];
            System.arraycopy(array, 0, resArray, 0, size);
            array = resArray;
        }
        array[size++] = o;
        return true;
    }

    public boolean remove(T o) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                System.arraycopy(array, i + 1, array, i, size - i);
                array[size - 1] = null;
                size--;
                count++;
                break;
            }
        }
        return count != 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
        System.out.println("MyList is cleaned");
    }

    public T get(int index) {
        checkIndex(index);
        return array[index];
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            System.err.println("Введите корректный индекс");
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public T set(int index, T element) {
        checkIndex(index);
        return array[index] = element;
    }

    public void add(int index, T element) {
        if (size >= array.length) {
            size++;
            T[] resArray = (T[]) new Object[3 * 2 * size + 1];
            System.arraycopy(array, 0, resArray, 0, index);
            System.arraycopy(array, index, resArray, index + 1, size - index);
            array = resArray;
            array[index] = element;
        }
        size++;
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        System.out.println("Element is added");
    }

    public T[] remove(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - index);
        array[size - 1] = null;
        size--;
        return array;
    }

    public int indexOf(T o) {
        int count = -1;
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                count = i;
                break;
            }
        }
        return count;
    }

    public int lastIndexOf(T o) {
        int count = -1;
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(array[i])) {
                count = i;
                break;
            }
        }
        return count;
    }

    public MyListWithGeneric<T> subList(int fromIndex, int toIndex) {
        checkIndex(fromIndex);
        checkIndex(toIndex);
        MyListWithGeneric<T> arrayList = new MyListWithGeneric<>();
        for (int i = fromIndex; i < toIndex; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyArrayList{ ");
        for (int i = 0; i < size; i++) {
            sb.append(array[i].toString()).append(" ");
        }
        sb.append("}");
        return sb.toString();
    }
}
