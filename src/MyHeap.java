public class MyHeap {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyHeap() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return array[0];
    }

    public Object extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        Object min = array[0];
        array[0] = array[size - 1];
        array[size - 1] = null;
        size--;
        heapifyDown();
        return min;
    }

    public void insert(Object o) {
        if (size == array.length) {
            resizeArray();
        }
        array[size++] = o;
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && ((Comparable<Object>) array[index]).compareTo(array[parentIndex(index)]) < 0) {
            swap(index, parentIndex(index));
            index = parentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = leftChildIndex(index);
            if (hasRightChild(index) && ((Comparable<Object>) array[rightChildIndex(index)]).compareTo(array[smallerChildIndex]) < 0) {
                smallerChildIndex = rightChildIndex(index);
            }
            if (((Comparable<Object>) array[index]).compareTo(array[smallerChildIndex]) < 0) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    private boolean hasParent(int index) {
        return index > 0;
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) < size;
    }

    private int leftChildIndex(int index) {
        return 2 * index + 1;
    }

    private boolean hasRightChild(int index) {
        return rightChildIndex(index) < size;
    }

    private int rightChildIndex(int index) {
        return 2 * index + 2;
    }

    private void swap(int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void resizeArray() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("heap: [");
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
