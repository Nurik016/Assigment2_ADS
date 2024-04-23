
public class MyArrayList<T> implements MyList<T> {

    private T[] arr;
    private int size;

    public MyArrayList() {
        arr = (T[]) new Object[10];
        size = 0;
    }

    @Override
    public void add(T item) {
        if (size >= arr.length) {
            increaseList();
        }
        arr[size++] = item;
    }

    private void increaseList() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public void set(int index, T item) {
        checker(index);
        arr[index]=item;
    }

    @Override
    public void add(int index, T item) {
        if (size >= arr.length) {
            increaseList();
        }
        checker(index);
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        size++;
    }

    public void checker(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index goes outside the list");
    }

    @Override
    public void addFirst(T item) {
        if (size >= arr.length) {
            increaseList();
        }
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = item;
        size++;
    }

    @Override
    public void addLast(T item) {
        arr[size] = item;
        size++;
    }

    @Override
    public T get(int index) {
        checker(index);
        return arr[index];
    }

    @Override
    public T getFirst() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("first empty");
        }
        return arr[0];
    }

    @Override
    public T getLast() {
        if(size==0){
            throw new IndexOutOfBoundsException("last empty");
        }
        return arr[size-1];
    }

    @Override
    public void remove(int index) {
        checker(index);
        for (int i = index + 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }

    @Override
    public void removeFirst() {
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
    }

    @Override
    public void removeLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("last empty");
        }
        arr[size - 1] = null;
        size--;
    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }
}