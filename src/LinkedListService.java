public class LinkedListService {

    private Node head = null;

    private Node tail = null;
    private int countSize;
    public void addNode(int value) {
        if (head == null) {
            head = tail = new Node(value);
        } else {
            tail.next = new Node(value);
            tail = tail.next;
        }
        countSize++;
    }
    public int size() {
        return countSize;
    }
    public Node getRootNode() {
        return this.head;
    }
}