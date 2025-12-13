package List.LinkedList.CircularLL;

public class CircularLinkedList {
    CircularNode head,tail;
    CircularLinkedList()
    {
         head = null;
         tail = null;
    }
    public  void display()
    {
        if(head == null)
        {
            System.out.println("Circular List is Empty");
            return;
        }
        CircularNode temp = head;
        do{
            System.out.print(temp.data +" ");
            temp = temp.next;
        } while(temp != head);

        System.out.println();
    }

    public  void  insertAtFirst(int data)
    {
        CircularNode newNode   = new CircularNode(data);
        if(head == null)
        {
            head  = newNode;
            tail = newNode;
            tail.next = head;
        }
        else
        {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

    }

    public void insertAtMiddle(int pos,int data){
        CircularNode newNode = new CircularNode(data);
        if(pos == 1){
            insertAtFirst(data);
        }


        else {
            int count = 1;
            CircularNode temp = head;
            CircularNode prev = null;
            while (count < pos && temp.next != head) {
                prev = temp;
                temp = temp.next;
                count++;
            }
            prev.next = newNode;
            newNode.next = temp.next;

            if(temp == head)
            {
                tail = newNode;
            }
        }
    }

    public void insertAtLast(int data){
        CircularNode newNode = new CircularNode(data);
        if(head == null)
        {
            head = tail = newNode;
            newNode.next = head;
        }
        else
        {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void deleteAtFirst()
    {
        if(head == null)
        {
            System.out.println("Circular Linked List is empty");
        }
        else {
            CircularNode temp = head;
            temp = temp.next;
            head = temp;
            tail.next = temp;
        }
    }

    public void deleteAtMiddle(int pos)
    {
        if(pos == 1) {
            deleteAtFirst();
            return;
        }
        CircularNode temp = head;
        CircularNode prev = null;
        int count = 1;
        while(count<pos && temp.next != head){
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = temp.next;
        temp.next = null;
    }

    public void deleteAtLast()
    {
        CircularNode temp = head;
        CircularNode prev = null;
        while(temp != tail)
        {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = head;
    }

    public static void main(String[] args)
    {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtFirst(1);
        cll.insertAtFirst(3);
        cll.insertAtFirst(4);
        cll.display();
        cll.insertAtLast(5);
        cll.display();

        cll.insertAtMiddle(2,20);
        cll.display();

        cll.deleteAtFirst();
        cll.display();

        cll.deleteAtMiddle(2);
        cll.display();

        cll.deleteAtLast();
        cll.display();

    }
}
