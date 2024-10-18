package Queue.SimpleQueue.LinkedList;
class QueueLinkedList{
    Node head;
    public void enque(int data)
    {
        Node newnode = new Node(data);
       if(head == null)
       {
           head  = newnode;
       }
       else {
           Node temp = head;
           while(temp.next != null)
           {
               temp = temp.next;
           }
           temp.next = newnode;
           newnode.next = null;
       }
    }

    public void deque()
    {
        if(head == null)
        {
            System.out.println("Queue is Empty");
        }
        else {
            Node temp = head;
            head = null;
            head = temp.next;
        }
    }
    public void display()
    {
        Node temp = head;

        while(temp.next != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public static void main(String[] args) {
        QueueLinkedList qll = new QueueLinkedList();
        System.out.println(qll.isEmpty());
        qll.enque(33);
        qll.enque(223);
        qll.enque(234);
        qll.enque(456);
        qll.display();
        qll.deque();
        qll.display();
        qll.deque();
        qll.display();
        System.out.println(qll.isEmpty());
    }
}