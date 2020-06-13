package Task;

public class FriendsList {
    private Person[] array;
    private int size;
    public static final int DEFAULT_CAPACITY = 10;

    public FriendsList() {
        array = new Person[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Person o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Person o) {
        if (size >= array.length) {
            Person[] resArray = new Person[3 * 2 * size + 1];
            System.arraycopy(array, 0, resArray, 0, size);
            array = resArray;
        }
        array[size++] = o;
        return true;
    }

    public boolean remove(Person o) {
        int count = 0;
        if (o.equals(array[size-1])) {
            array[size - 1] = null;
            size--;
        }
        for (int i = 0; i < size - 1; i++) {
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

    public Person get(int index) {
        checkIndex(index);
        return array[index];
    }

    public Person set(int index, Person element) {
        checkIndex(index);
        return array[index] = element;
    }

    public void add(int index, Person element) {
        if (size >= array.length) {
            size++;
            Person[] resArray = new Person[3 * 2 * size + 1];
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

    public Person[] remove(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - index);
        array[size - 1] = null;
        size--;
        return array;
    }

    public int indexOf(Person o) {
        int count = -1;
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                count = i;
                break;
            }
        }
        return count;
    }

    public int lastIndexOf(Person o) {
        int count = -1;
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(array[i])) {
                count = i;
                break;
            }
        }
        return count;
    }

    public FriendsList subList(int fromIndex, int toIndex) {
        checkIndex(fromIndex);
        checkIndex(toIndex);
        FriendsList arrayList = new FriendsList();
        for (int i = fromIndex; i < toIndex; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FriendsList{ ");
        for (int i = 0; i < size; i++) {
            sb.append(array[i].getFirstName()).append(" ");
        }
        sb.append("}");
        return sb.toString();
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            System.err.println("Введите корректный индекс");
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }


}
