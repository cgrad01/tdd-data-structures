import java.util.Arrays;
import java.util.Objects;

public class LinkedList {
    private LinkListNode head;
    private LinkListNode tail;

    public LinkedList(Integer... integers) {
        this.head = createNodes(integers);
    }

    public LinkListNode head() {
        return this.head;
    }

    public LinkListNode tail() {
        return this.tail;
    }

    private LinkListNode createNodes(Integer... integers) {
        if (integers.length == 0) {
            return new LinkListNode();
        }
        var nodeToAdd = new LinkListNode(integers[0]);
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

    public LinkListNode findFirst(Integer value) {
        LinkListNode current = this.head;
        while (current != null && !Objects.equals(value, current.value)) {
            current = current.next();
        }
        return current;
    }

    public void remove() {
        if (this.head == this.tail) {
            this.head = new LinkListNode();
            this.tail = this.head;
            return;
        }
        LinkListNode current = this.head;
        while (this.tail != current.next()) {
            current = current.next();
        }
        current.setNext(null);
        this.tail = current;
    }
}
