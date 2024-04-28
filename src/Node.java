public class Node<T> {
    T data;
    Node<T> next;

    private Node(T data) {
        this.data = data;
        this.next = null;
    }

    public static <T> Node<T> createNode(T data) {
        return new Node<>(data);
    }
}
