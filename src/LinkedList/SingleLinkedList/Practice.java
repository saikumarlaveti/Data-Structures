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
                while(t.next != null)
                {
                    t = t.next;
                }
                t.next = n;
        }
    }
    void insertAtMiddle(int index,int data)
    {
        if(index == 0)
        {
            insertAtFirst(data);
            return;
        }
        Node n = new Node(data);
        Node t = head;
        for(int i = 0;i<index-1;i++)
        {
            t = t.next;
        }
        n.next = t.next;
        t.next = n;
    }

    int deleteAtFirst()
    {
        if(head == null)
            return -1;

        Node t = head;
        head = head.next;
        int item = t.data;
        t = null;
        return item;
    }
    int deleteAtLast()
    {
        if(head == null)
            return -1;

        Node t = head;
        Node prev = null;

        while(t.next!= null){
            prev = t;
            t = t.next;}
        int item = t.data;
        prev.next = null;
        t = null;
        return item;
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

    int deleteAtMiddle(int item)
    {
        if(head == null){
            return -1;}

        Node t = head;
        Node prev = null;

        while(t.data != item && t.next!=null)
        {
            prev = t;
            t = t.next;
        }
        if(t.data == item)
        {
            prev.next = t.next;
            t = null;
            return item;
        }
        else
            return -2;
    }

    public static void main(String[] args)
    {
        Practice p = new Practice();
        p.insertAtFirst(1);
        p.insertAtFirst(2);
        p.display();
        System.out.println();
        p.insertAtMiddle(1,66);
        p.display();
        System.out.println();
        int res = p.deleteAtFirst();
        if(res <0 )
            System.out.println("Node is empty");
        else
            System.out.println("Deleted Node is "+res);
        p.display();
        System.out.println();
    int res1 =     p.deleteAtLast();
    if(res1<0)
        System.out.println("Node  is empyt");
    else
        System.out.println("Deleted Node is "+res1);
    p.display();

    p.insertAtFirst(9);
    p.insertAtFirst(4);
    p.insertAtFirst(23);
    p.display();
    int res2 = p.deleteAtMiddle(4);
        System.out.println();
    if(res2<0)
        System.out.println("Node is empty");

    else
        System.out.println("Item is Deleted -"+res2);
    p.display();
    }
}