
public class LinkedList {
    private Node head;
    public LinkedList() {
        this.head = new Node();
    }

    public LinkedList(Integer integer) {
        this.head = new Node(integer);
    }

    public Node head() {
        return this.head;
    }
}
