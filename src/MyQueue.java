public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;

    public MyQueue() {
        head = null;
        tail = null;
    }

    public void enqueue(T obj) {
        Node<T> newNode = new Node<>(obj);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public T front() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
