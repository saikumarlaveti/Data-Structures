package Leetcode;

class Node{
    Node next;
    int val;
     Node(int  data){
        this.val = data;
        next =null;
    }
}
public class LC_203_RemoveLinkedListElements {
    Node head = null;
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
                    head = newNode;
                }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
public void printNode(){
        if(head == null){
            System.out.println("Empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    System.out.println();
}
        public Node removeElements( int val) {
            while (head != null && head.val == val) {
                head = head.next;
            }
            Node previous = null;
            Node current = head;
            while(current != null){
                if(current.val == val){
                    previous.next = current.next;
                }
                else{
                    previous = current;
                }
                current = current.next;
            }
            return head;
        }

    public static void main(String[] args) {
            LC_203_RemoveLinkedListElements rl = new LC_203_RemoveLinkedListElements();
            rl.insertAtFirst(1);
            rl.insertAtFirst(2);
            rl.insertAtFirst(3);
            rl.insertAtFirst(3);
            rl.insertAtFirst(4);
            rl.printNode();
            rl.removeElements(3);
            rl.printNode();
    }
}

