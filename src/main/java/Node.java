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

    public void setNext(Integer integer)
    {
       this.next = new Node(integer);
    }
}
