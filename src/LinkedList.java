public class LinkedList {

    private Node head;
    public LinkedList()
    {
        this.head = null;
    }

    public void add(int n)
    {
        Node newNode = new Node(n);
        if(this.head == null) this.head = newNode;
        else
        {
            Node tempNode = this.head;
            while(tempNode.next != null)
            {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    public String toString()
    {
        String str = "";
        Node tempNode = this.head;
        while(tempNode.next != null)
        {
            str += tempNode;
            tempNode = tempNode.next;
            if(tempNode.next == null) str += tempNode;
        }

        return str;
    }
}
