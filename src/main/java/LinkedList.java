import java.util.Arrays;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(Integer... integers) {
        this.head = createNodes(integers);
    }

    public Node head() {
        return this.head;
    }

    public Node tail() {
        return this.tail;
    }

    private Node createNodes(Integer... integers) {
        if (integers.length == 0) {
            return new Node();
        }
        var nodeToAdd = new Node(integers[0]);
        if (integers.length == 1) this.tail = nodeToAdd;
        return nodeToAdd
                .setNext(createNodes(Arrays.copyOfRange(integers, 1, integers.length)));
    }

    public void add(Integer... newNodes) {
        if (null == this.head().value) {
            this.head = createNodes(newNodes);
            return;
        }
        this.tail.setNext(createNodes(newNodes));
    }

    public Node find(Integer value) {
        Node current = this.head();
        while(value != current.value) {
            current = current.next();
        }
        return current;
    }
}
