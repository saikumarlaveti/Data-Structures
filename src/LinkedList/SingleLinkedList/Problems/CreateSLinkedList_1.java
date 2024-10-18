package LinkedList.SingleLinkedList.Problems;

public class CreateSLinkedList_1 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;

    public void insertAtFirst(int data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
        }
        else {
            Node temp  = head;
            newnode.next = temp;
            head = newnode;
        }
    }

    public void display()
    {
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        CreateSLinkedList_1 csl = new CreateSLinkedList_1();
        csl.insertAtFirst(56);
        csl.insertAtFirst(45);
        csl.insertAtFirst(1);
        csl.display();
    }
}
