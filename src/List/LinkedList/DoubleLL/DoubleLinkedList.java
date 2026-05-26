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

public void insertAtSpecificPositiion(int value,int position){
    int size = sizeOfTheDoubleLinkedList();
    DoubleNode node = new DoubleNode();
    if(head == null || position <=1){
        insertAtFirst(value);
    }
    else if(size<position){
        insertAtLast(value);
    }
    else{
        DoubleNode temp = head;
        for(int i = 1;i<position-1;i++){
            temp = temp.next;
        }
        node.next = temp.next;
        node.pre = temp;
        temp.next = node;
        node.value = value;
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

    public int sizeOfTheDoubleLinkedList(){
        int count = 0;
        if(head == null){
            return  0;
        }
        else{

            DoubleNode temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

    public void deleteAtFirst(){
        if(head == null){
            return;
        }
        else{
            head  = head.next;
        }
    }

    public void deleteAtSpecificPosition(int position){
    if(head == null){
    } else if (position <=1 ) {
        deleteAtFirst();
    }
    else{
        DoubleNode temp = head;
        for(int i = 1;i<position-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    }


    public void deleteAtLast(){
        if(head == null || head == tail){
            return;
        }
        else {
            DoubleNode temp = head;
            DoubleNode pre = null;
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            pre.next = null;
        }
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

        System.out.println(dll.sizeOfTheDoubleLinkedList());
        System.out.println("insert at specific position :: ");
        dll.insertAtSpecificPositiion(40,5);
        dll.display();
        System.out.println("delete at first");
        dll.deleteAtFirst();
        dll.display();
        System.out.println("delete at last");
        dll.deleteAtLast();
        dll.display();
        System.out.println("delete at position - 2" );
        dll.deleteAtSpecificPosition(2);
        dll.display();
    }
}
