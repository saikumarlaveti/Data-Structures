package List.LinkedList.Problems;

public class PrintMiddleElement {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void insertAtFirsr(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }

    public void printElement(){
        int count = 1;
        int length = findLength();
        //System.out.println(length);
        int midElement = length/2;
        //System.out.println(midElement);
        Node temp = head;
        while(temp.next != null && count <= midElement ){
            temp = temp.next;
            count++;
        }
        System.out.println("Linkedlist mid element is: " + temp.data);
    }
    //find length of linked list
    public int findLength(){
        int count = 0;
        if(head == null){
            return  count;
        }
        else{
            Node temp = head;
            while(temp != null){
               // System.out.println(head.data +" "+  count);
                temp = temp.next;
                count++;
            }
        }
        return count;
    }

    public void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        PrintMiddleElement pm = new PrintMiddleElement();
        pm.insertAtFirsr(60);
        pm.insertAtFirsr(50);
        pm.insertAtFirsr(40);
        pm.insertAtFirsr(30);
        pm.insertAtFirsr(20);
        pm.insertAtFirsr(10);
        pm.display();
        System.out.println(pm.findLength());
       pm.printElement();
    }
}
