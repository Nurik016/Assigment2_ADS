public class MyLinkedList<T> implements MyList<T>{

    private Node<T> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }


    private void checker(int index){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("index goes outside the list");
    }

    private void empty(){
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
    }


    public void add(T item) {
        Node<T> newNode = Node.createNode(item);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public void set(int index, T item) {
        try {
            checker(index);
            if(index==size){
                add(item);
                return;
            }
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.data = item;
        }catch (Exception e){
            System.out.println("An error occurred in(set) : " + e.getMessage());
        }
    }

    @Override
    public void add(int index, T item) {
        try {
            checker(index);
            Node<T> newNode = Node.createNode(item);

            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node<T> current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
            size++;
        }catch (Exception e){
            System.out.println("An error occurred in(add) : " + e.getMessage());
        }
    }

    @Override
    public void addFirst(T item) {
        Node<T> newNode = Node.createNode(item);

        newNode.next = head;
        head = newNode;
        size++;
    }

    @Override
    public void addLast(T item) {
        Node<T> newNode = Node.createNode(item);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        try {
            checker(index);
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }catch (Exception e){
            System.out.println("An error occurred in(get) : " + e.getMessage());
            return null;
        }
    }

    @Override
    public T getFirst() {
        empty();
        return head.data;
    }

    @Override
    public T getLast() {
        empty();
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public void remove(int index) {
        try {
            checker(index);
            if (index == 0) {
                head = head.next;
            } else {
                Node<T> current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
            size--;
        }catch (Exception e){
            System.out.println("An error occurred in(remove) : " + e.getMessage());
        }
    }

    @Override
    public void removeFirst() {
        empty();
        head = head.next;
        size--;
    }

    @Override
    public void removeLast() {
        empty();
        if (head.next == null) {
            head = null;
        } else {
            Node<T> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    @Override
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node<T> current = head;
            Node<T> previous = null;

            while (current.next != null) {
                if (((Comparable<T>) current.data).compareTo(current.next.data) > 0) {
                    T temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                previous = current;
                current = current.next;
            }
        } while (swapped);
    }

    @Override
    public int indexOf(Object object) {
        int index = 0;
        Node<T> current = head;

        while (current != null) {
            if (object == null ? current.data == null : object.equals(current.data)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int lastIndex = -1;
        int index = 0;
        Node<T> current = head;

        while (current != null) {
            if (object == null ? current.data == null : object.equals(current.data)) {
                lastIndex = index;
            }
            current = current.next;
            index++;
        }
        return lastIndex;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> current = head;
        int index = 0;

        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }

        return array;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }
}