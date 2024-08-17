package LinkedList.SingleLinkedList;
class Practice{
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    Node head = null;
    Practice(){
        head = null;
    }
    public void insertAtFirst(int data)
    {
        Node n = new Node(data);

        if(head !=null)
        {
            n.next = head;
        }
        head = n;
    }
    public void insertAtLast(int data)
    {
        Node n = new Node(data);
        if(head == null)
        {
            head = n;
        }
        else
        {
                Node t = head;
                while(t != head)
                {
                    t = t.next;
                }
                t.next = n;
        }
    }
    void insertAtMiddle(int data,int item)
    {

    }

    public void display ()
    {
        Node t = head;
        while(t != null)
        {
            System.out.print(t.data+"\t");
            t = t.next;
        }
    }
    public static void main(String[] args)
    {
        Practice p = new Practice();
        p.insertAtFirst(1);
        p.insertAtFirst(2);
        p.insertAtFirst(3);
        p.display();
        p.insertAtLast(4);
        System.out.println();
        p.display();
    }
}