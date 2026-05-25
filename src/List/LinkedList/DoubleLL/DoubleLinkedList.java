package List.LinkedList.DoubleLL;

public class DoubleLinkedList {
DoubleNode head;
DoubleNode tail;

public void insertAtFirst(int value){
    DoubleNode node = new DoubleNode();
    node.value = value;
    if(head == null){
        node.pre = node.next = null;
        head  = node;
        tail = node;
    }
    else {
     node.next = head;
     head.pre = node;
     node.pre = null;
     head = node;
    }
}

public void insertAtLast(int value) {
    if (head == null) {
        insertAtFirst(value);
    }
    else{
        DoubleNode node = new DoubleNode();
        node.value = value;
        tail.next = node;
        node.pre = tail;
        node.next = null;
        tail = node;
    }
}
    public void display(){
    if(head == null){
        return;
    }
    else {
        DoubleNode temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
        System.out.println();
    }
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertAtFirst(1);
        dll.insertAtFirst(2);
        dll.insertAtFirst(3);
        dll.display();
        dll.insertAtLast(10);
        dll.display();
        dll.insertAtLast(20);
        dll.display();
    }
}
