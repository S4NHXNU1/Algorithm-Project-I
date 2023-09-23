public class LinkedList {

    private Node head;
    public LinkedList()
    {
        this.head = null;
    }

    public void add(CartItem n)
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

    public void remove()
    {
        Node tempNode = this.head;
        if(tempNode.next == null)
        {
            this.head = null;
            return;
        }
        while(tempNode.next != null)
        {
            if(tempNode.next.next == null)
            {
                tempNode.next = null;
                break;
            }
            tempNode = tempNode.next;
        }
    }

    public boolean remove(int i)
    {
        if(i < this.size() && i >= 0 && this.head != null)
        {
            if (i == 0) 
            {
                this.head = this.head.next;
                return true;
            }

            Node tempNode = this.head;
            int c = 0;
            while(tempNode != null)
            {
                if(c == i-1)
                {
                    tempNode.next = tempNode.next.next;
                    return true;
                }
                tempNode = tempNode.next;
                c++;
            }
        }
        return false;
    }

    public int size()
    {
        if(this.head == null) return 0;
        
        Node tempNode = this.head;
        int c = 1;
        while(tempNode.next != null)
        {
            tempNode = tempNode.next;
            c++;
        }
        return c;
    }

    public String toString()
    {
        if(this.head == null) return "[]";

        String str = "[" + this.head;
        Node tempNode = this.head;
        int c = 0;
        while(tempNode.next != null)
        {
            if(c != 0) str += "," + tempNode;
            tempNode = tempNode.next;
            if(tempNode.next == null) str += "," + tempNode;
            c++;
        }

        return str + "]";
    }
}
