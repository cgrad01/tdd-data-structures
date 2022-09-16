public class Node {
    public Integer value;
    public Node next;

    public Node(){}

    public Node(Integer integer) {
        this.value = integer;
    }

    public Node next() {
        return this.next;
    }

    public Node setNext(Node nextNode)
    {
       this.next = nextNode;
       return this;
    }
}
