package LinkedList.SingleLinkedList;

class Practice
{
    Node head ;
    Practice ( )
    {
        head = null;
    }

    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
void insertAtFirst(int data)
{
    Node n = new Node(data);
    if(head != null)
    {
        n.next = head;
    }
    head = n;
}
void display()
{
    Node t  = head;
    while(t.next!=null)
    {
        System.out.print(t.data+"\t");
        t = t.next;
    }
    System.out.print(t.data);

}

    public static void main(String[] args)
    {
     Practice p = new Practice();
     p.insertAtFirst(1);
     p.insertAtFirst(2);
     p.insertAtFirst(3);
     p.display();

    }
}