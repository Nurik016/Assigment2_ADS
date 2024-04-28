public class MyQueue {
    private Node head;
    private Node tail;

    public MyQueue() {
        head = null;
        tail = null;
    }

    public void enqueue(Object obj) {
        Node newNode = new Node(obj);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        Object data = head.data;
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

    public Object front() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    private static class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
}
