package LinkedList.SingleLinkedList;

public class SingleLL
{
    Node head = null;
    SingleLL()
    {
        head = null;
    }
    public void insertAtFirst(int data)
    {
        Node n = new Node(data);
        if(head != null)
        {
            n.next = head;
        }
        head = n;
    }


    public void insertAtMiddle(int pos,int data)
    {
        if(pos == 1)
        {
            insertAtFirst(data);
            return;
        }
        Node  n = new Node(data);
        Node t  = head;
        for(int i = 1;i<pos-1;i++){
            t = t.next;
        }
        n.next = t.next;
        t.next = n;
    }


    public void insertAtLast(int data)
    {
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        else {
            Node t = head;
            while(t.next != null)
            {
                t = t.next;
            }
            t.next = n;
        }
    }



    void deleteAtFirst()
    {
        if(head == null)
        {
            System.out.println("Sll is Empty");
        }
        else
        {
            Node  t  = head;
            t = t.next;
            head = t;
        }
    }

        void deleteAtMiddle(int data) {
            Node t = head;
            Node prev = null;
            while (t.next != null && t.data != data) {
                prev = t;
                t = t.next;
            }
            if (t.data == data) {
                prev.next = t.next;
                t = null;
            } else {
                System.out.println("Element not found");
            }
        }
            void deleteAtLast()
            {
                Node  t = head;
                Node prev = null;
                while(t.next != null)
                {
                    prev = t;
                    t = t.next;
            }
                if(t.next == null)
                prev.next = null;

    }
    public void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + "\t");
            t = t.next;
        }
    }
    public static void main(String[] args)
    {
        SingleLL sll = new SingleLL();
        sll.insertAtFirst(1);
        sll.insertAtLast(3);
        sll.insertAtMiddle(1,4);
        sll.display();

        System.out.println();
        sll.insertAtFirst(5);
        sll.insertAtMiddle(2,6);
        sll.insertAtLast(100);
        sll.display();

        System.out.println();
        sll.deleteAtMiddle(3);
        sll.display();
        sll.deleteAtFirst();
        System.out.println();
        sll.display();
        sll.deleteAtFirst();
        System.out.println();
        sll.display();

        System.out.println();
        sll.deleteAtLast();
        sll.display();
    }
}
