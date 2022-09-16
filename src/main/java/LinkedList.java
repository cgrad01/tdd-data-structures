import java.util.Objects;

public class LinkedList {
    private Node head;
    public LinkedList(Integer... integers) {
        Integer firstValue = integers.length == 0 ? null : integers[0];
        this.head = new Node(firstValue);
        for (int i = 1; i < integers.length; i++) {
            Integer nextValue = integers.length > 1 ? integers[1] : null;
            this.head.setNext(nextValue);
        }
    }

    public Node head() {
        return this.head;
    }
}
