public class Node {
    
    private int ID;
    Node next;

    public Node(int ID)
    {
        this.ID = ID;
        this.next = null;
    }

    public String toString()
    {
        return ""+ID ;
    }
}
