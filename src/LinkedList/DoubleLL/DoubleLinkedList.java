package LinkedList.DoubleLL;

public class DoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;
    DoubleLinkedList(){
         head = null;
    }

    public void insertAtFirst(int data){
        DoubleNode n = new DoubleNode(data);
        if(head == null){
            head = n;
            tail = n;
        }
        else
        {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    public void insertAtMiddle(int pos,int data)
    {
        DoubleNode temp = new DoubleNode(data);

        if(pos == 1)
        {
            insertAtFirst(data);
        }
        else
        {
            DoubleNode current = head;
            int count = 1;
            while(current != null && count <pos)
            {
                current = current.next;
                count++;
            }
            if(current == null)
            {
                insertAtLast(data);
            }
            else
            {
                temp.next = current;
                temp.prev = current.prev;
                current.prev.next = temp;
                current.prev = temp;
            }

        }
    }
    public void insertAtLast(int data)
    {
        DoubleNode temp = new DoubleNode(data);
        if(head == null)
        {
            head  = temp;
        }
        else {
            DoubleNode current = head;
            while(current.next!=null)
            {
                current = current.next;
            }
            if(current.next == null)
            {
                current.next = temp;
                temp.prev = current.next;
                temp.next = null;
            }
        }
    }
    public void display()
    {
        DoubleNode t = head;
        while(t != null)
        {
            System.out.print(t.data+" ");
            t = t.next;
        }
        System.out.println();
            }
    public void insertAtEnd(int data)
    {
        DoubleNode temp = new DoubleNode(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public void deletionOfFirst()
    {
        DoubleNode temp  = head;
        if(head == null)
        {
            System.out.println("Double Linked List is Empty");
        }
        else
        {
         head = temp.next;
         temp.prev = null;
         temp.next = null;
        }
    }

    public void deleteAtMiddle(int pos)
    {
        DoubleNode current = head;
        int count = 1;
        while(current != head &&  count != pos)
        {
            current = current.next;
            count++;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.next = null;
        current.prev = null;
    }

    public void deleteAtLast()
    {
        if(head == null) {
            System.out.println("Node is Empty");
            return;
        }
        DoubleNode temp = head;
        DoubleNode prevs = null;
        while(temp.next != null)
        {
            prevs = temp;
            temp = temp.next;
        }
        prevs.next = null;
        temp.prev = null;

    }




    public static void main(String[] args)
    {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertAtFirst(123);
        dll.display();
        dll.insertAtFirst(1);
        dll.display();

        dll.insertAtMiddle(3,101);
        dll.display();

        dll.insertAtLast(1021);
       dll.insertAtEnd(369);


        dll.insertAtFirst(1);
        dll.insertAtLast(3);
        dll.insertAtMiddle(3,10);
        dll.display();
        dll.deleteAtLast();
        dll.display();

        dll.deletionOfFirst();
        dll.display();

        dll.deletionOfFirst();
        dll.display();

        dll.deleteAtMiddle(2);
        dll.display();
    }
}
