package LinkedList.CircularLL;

public class CircularLinkedList {
    CircularNode head,tail;
    CircularLinkedList()
    {
         head = null;
         tail = null;
    }
    public  void display()
    {
        CircularNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public  void  insertAtFirst(int data)
    {
        CircularNode newNode   = new CircularNode(data);
        if(head == null)
        {
            head  = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
        // tail.next = head;

    }

    public void insertAtMiddle(int pos,int data){
        CircularNode newNode = new CircularNode(data);
        if(pos == 1){
            insertAtFirst(data);
        }


        else {
            int count = 1;
            CircularNode temp = head;
            CircularNode prevs = null;
            while (count < pos && temp.next != null) {
                prevs = temp;
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            prevs.next = newNode;

        }
    }

    public void insertAtLast(int data){
        CircularNode newNode = new CircularNode(data);
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
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

        cll.insertAtMiddle(5,20);
        cll.display();
    }
}
