package List.LinkedList.SingleLinkedList.Problems;

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

    public void insertAtMiddle(int pos,int data){
        if(pos == 1){
            insertAtFirst(data);
            return;
        }
        int count = 1;
        Node temp = head;
        while(count<pos-1 && temp.next != null){
            temp = temp.next;
            count++ ;
        }
        if(temp == null){
            insertAtLast(data);
        }
        else {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }


    }
    public void insertAtLast(int data){
        Node newnode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;

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

    public void deleteAtMiddle(int pos){
        Node temp = head;
        int count  =  1;
        Node prev = null;
        while(count<pos && temp.next != null){
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = temp.next;
    }
    public void deleteAtLast(){
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }

               prev.next = null;

    }
    public void search(int element){
        Node temp = head;
        while(temp!= null){
            if(temp.data == element){
                System.out.println("element found " );
                return;
            }
            temp = temp.next;
        }
        System.out.println("element not found");
    }
    public void minAndMax(){
        Node temp = head;
        int min = temp.data;
        int max = temp.data;
        while(temp.next != null){
           if(min>temp.data){
               min = temp.data;
           }
           if(max <temp.data){
               max = temp.data;
           }
           temp = temp.next;
        }
        System.out.println("Minimum Element " + min);
        System.out.println("Maximum Element " + max);
    }
    public static void main(String[] args) {
        CreateSLinkedList_1 sl = new CreateSLinkedList_1();
        sl.insertAtFirst(1);
        sl.insertAtFirst(2);
        sl.insertAtLast(4);
        sl.insertAtLast(5);
        sl.insertAtMiddle(3,10);
        sl.display();
        sl.deleteAtLast();
        sl.display();
        sl.search(2);
        sl.minAndMax();
    }

}
