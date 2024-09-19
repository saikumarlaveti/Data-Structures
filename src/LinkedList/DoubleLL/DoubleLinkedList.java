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
    public static void main(String[] args)
    {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertAtFirst(123);
        dll.display();
        dll.insertAtFirst(1);
        dll.display();
    }
}
