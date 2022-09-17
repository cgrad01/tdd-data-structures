import java.util.Arrays;
import java.util.Objects;

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

    public Node findFirst(Integer value) {
        Node current = this.head;
        while (current != null && !Objects.equals(value, current.value)) {
            current = current.next();
        }
        return current;
    }

    public void remove() {
        Node current = this.head;
        while (current.next() != this.tail) {
            current = current.next();
        }
        current.setNext(null);
        this.tail = current;
    }
}
