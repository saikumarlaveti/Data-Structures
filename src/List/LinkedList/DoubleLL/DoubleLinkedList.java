package List.LinkedList.DoubleLL;

public class DoubleLinkedList {
DoubleNode head;
DoubleNode tail;

public void insertAtFirst(int value){
    DoubleNode node = new DoubleNode();
    if(head == null){
        node.value = value;
        node.pre = node.next = null;
        head  = tail = node;
    }
    else {
     node.value = value;
     node.next = head;
     head.pre = node;
     node.pre = null;
     head = node;
    }
}
    public void display(){
    if(head == null){
        return;
    }
    else {
        DoubleNode temp = head;
        do{
            System.out.println(temp.value);
            temp = temp.next;
        }while(temp.next != null);
    }
    }
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertAtFirst(1);
        dll.insertAtFirst(2);
        dll.insertAtFirst(3);
        dll.display();
    }
}
