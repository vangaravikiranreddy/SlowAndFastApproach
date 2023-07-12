public class Main {
    public static void main(String[] args) {
        LinkedListService linkedListService = new LinkedListService();
        linkedListService.addNode(10);
        linkedListService.addNode(11);
        linkedListService.addNode(12);
        linkedListService.addNode(13);
        linkedListService.addNode(14);
        linkedListService.addNode(15);
        linkedListService.addNode(16);

        SlowAndFastApproach slowAndFastApproach = new SlowAndFastApproach();
        Node middleNode = slowAndFastApproach.getMiddleNode(linkedListService.getRootNode());

        System.out.println(middleNode.value);
    }
}