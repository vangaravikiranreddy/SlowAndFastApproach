public class SlowAndFastApproach {
    public Node getMiddleNode(Node root) {
        Node slow = root;
        Node fast = root;

        while (fast != null && fast.next != null) {
              slow = slow.next;
              fast = fast.next.next;
        }
        return slow;
    }
}
