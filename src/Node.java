public class Node {
    
    CartItem ITEM;
    Node next;

    public Node(CartItem ITEM)
    {
        this.ITEM = ITEM;
        this.next = null;
    }

    public String toString()
    {
        return ""+ITEM ;
    }
}
