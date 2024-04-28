public class MyStack<T> {
    private T[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyStack() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[size - 1];
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T o = array[size - 1];
        array[size - 1] = null;
        size--;
        return o;
    }

    public void push(T o) {
        if (size == array.length) {
            resizeArray();
        }
        array[size++] = o;
    }

    private void resizeArray() {
        T[] newArray = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("stack: [");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
