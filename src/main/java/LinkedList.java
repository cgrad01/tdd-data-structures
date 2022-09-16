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
        var currentNode = this.head();
        if (null == currentNode.next()) {
            this.head = createNodes(newNodes);
            return;
        }
        while (currentNode.next().value != null) {
            currentNode = currentNode.next();
        }
        currentNode.setNext(createNodes(newNodes));
    }
}
