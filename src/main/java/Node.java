public class Node {
    public Integer value;

    public Node(){}

    public Node(Integer integer) {
        this.value = integer;
    }

    public Node next() {
        return new Node();
    }
}
