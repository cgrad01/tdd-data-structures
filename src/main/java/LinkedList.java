import java.util.Arrays;

public class LinkedList {
    private Node head;

    public LinkedList(Integer... integers) {
        this.head = addAll(integers);
    }

    public Node head() {
        return this.head;
    }

    private Node addAll(Integer... integers) {
        if (integers.length == 0) {
            return new Node();
        }
        return new Node(integers[0])
                .setNext(addAll(Arrays.copyOfRange(integers, 1, integers.length)));
    }
}
