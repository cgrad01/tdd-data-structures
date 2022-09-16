import java.util.Arrays;
import java.util.Objects;

public class LinkedList {
    private Node head;

    public LinkedList(Integer... integers) {
        Integer firstValue = integers.length == 0 ? null : integers[0];
        this.head = addAll(integers);
    }

    public Node head() {
        return this.head;
    }

    public Node addAll(Integer... integers) {
        if (integers.length == 1) {
            return new Node(integers[0]);
        }
        if (integers.length == 0) {
            return new Node();
        }
        return new Node(integers[0]).setNext(addAll(Arrays.copyOfRange(integers, 1, integers.length)));
    }
}
