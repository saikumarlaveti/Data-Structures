package LinkedList.DoubleLinkedList;

public class DoubleLinkedList {
    Node head;

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void insertAtMiddle(int data,int position)
    {
        Node newNode = new Node(data);
        if(position <0 || head == null)
        {
            insertAtFirst(data);
        }
        else
        {
            Node current = head;
            int count  = 1;

            while(current != null && count <position){
                current = current.next;
                count++;
            }
            if(current == null){
                insertAtLast(data);
                return;
            }
            newNode.next = current;
            newNode.prev = current.prev;

            if(current.prev != null){
                current.prev.next = newNode;
            }
            current.prev = newNode;
        }

    }


    public void print()
    {
        if(head == null)
        {
            System.out.println("Node is empty");
        }
        else{
            Node current = head;
            while (current != null)
            {
                System.out.print(current.data+" ");
                current = current.next;
            }
        }
    }

    public void deleteAtFirst(int data)
    {

    }

}
