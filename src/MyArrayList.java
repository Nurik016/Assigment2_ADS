
public class MyArrayList<T> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] arr;
    private int size;

    public MyArrayList() {
        arr = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }


    private void increaseList() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        if (size >= 0) System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }


    private void checker(int index){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("index goes outside the list");
    }


    @Override
    public void add(T item) {
        if (size >= arr.length) {
            increaseList();
        }
        arr[size++] = item;
    }


    @Override
    public void set(int index, T item) {
        try {
            checker(index);
            arr[index]=item;
        }catch (Exception e){
            System.out.println("An error occurred in(set) : " + e.getMessage());
        }
    }

    @Override
    public void add(int index, T item) {
        try {
            if (size >= arr.length) {
                increaseList();
            }
            checker(index);
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = item;
            size++;
        }catch (Exception e){
            System.out.println("An error occurred in(add) : " + e.getMessage());
        }
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
        try {
            checker(index);
            return arr[index];
        }catch (Exception e){
            System.out.println("An error occurred in(get) : " + e.getMessage());
            return null;
        }
    }

    //teachet said that its a wrong code
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
        try {
            checker(index);
            for (int i = index + 1; i < size; i++) {
                arr[i-1] = arr[i];
            }
            size--;
        }catch (Exception e){
            System.out.println("An error occurred in(remove) : " + e.getMessage());
        }
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
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                // Swap if the current element is greater than the next element
                if (((Comparable<T>) arr[j]).compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--) {
            if (object.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) >= 0;
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[size];
        System.arraycopy(arr, 0, newArray, 0, size);
        return newArray;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }
}
