package LinkedList.Problems;

public class ReverseLinkedlist {
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
//insert at last
    public void insertAtLast(int data){
        Node newNode  = new Node(data);
        if(head == null ){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
//print reverse linked list
    public void reverse(Node current){
        if(head == null){
            System.out.println("Linkedlist is empty");
        }
        else{
                if(current.next == null){
                    System.out.print(current.data + " ");
            }
                else {
                    reverse(current.next);
                    System.out.print(current.data + " ");
                }
        }
    }
    // delete at first node
    public void deleteAtFirst(){
        if(head == null){
            System.out.println("Linked List is Empty");
        }
        else {
            head = head.next;
        }
    }
    public static void main(String[] args) {
            ReverseLinkedlist rl = new ReverseLinkedlist();
            rl.insertAtLast(1);
            rl.insertAtLast(2);
            rl.insertAtLast(3);
            rl.display();
            System.out.println("reverse");
            rl.reverse(rl.head);
            System.out.println();
            rl.deleteAtFirst();
            rl.display();
    }
}
