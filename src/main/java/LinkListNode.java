public class LinkListNode {
    public Integer value;
    public LinkListNode next;

    public LinkListNode(){}

    public LinkListNode(Integer integer) {
        this.value = integer;
    }

    public LinkListNode next() {
        return this.next;
    }

    public LinkListNode setNext(LinkListNode nextNode)
    {
       this.next = nextNode;
       return this;
    }
}
