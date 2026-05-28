package List.LinkedList.DoubleCircularLL;

public class DoubleCircularLinkedList {
    public Node head;
    public Node tail;

    public void insertAtFirst(int value){
        System.out.println("Insert At First - " + value);
        Node node = new Node();
        node.next = head;
        if(head == null){
            node.pre = null;
            node.value = value;
            head = tail = node;
        }
        else{
            node.value = value;
            node.pre = null;
            head.pre = node;
            tail.next = node;
            head = node;
        }
    }

    public void insertAtLast(int value){
        System.out.println("Insert At Last - " + value);
        if(head == null){
            insertAtFirst(value);
        }
        else{
            Node node = new Node();
            node.value = value;
            tail.next = node;
            node.pre = tail;
            tail = node;
            node.next = head;
            head.pre = node;
        }
    }

    public void insertAtSpecificPosition(int pos,int value){
        System.out.println("Insert At Specific Position " + pos + " Value " + value);
        int  size = size();
        if(head == null || pos<=1){
            insertAtFirst(value);
        } else if (size < pos) {
            System.out.println("Position is greater than length of the linked list "+pos + "please choose lower then position");
        }
        else {
            Node temp = head;
            for(int i = 1;i<pos-1;i++){
                temp = temp.next;
            }
            Node node = new Node();
            node.value = value;
            node.next = temp.next;
            node.pre = temp;
            temp.next = node;
            temp.next.pre = node;


        }
    }

    public void deleteAtFirst(){
        System.out.println("Delete At First -" + head.value);
        if(head == null){
            return;
        } else if (head == tail) {
            head = null;
        } else{
            head = head.next;
            head.pre = tail;
            tail.next = head;

        }
    }

    public void deleteAtSpecificPosition(int pos){
        System.out.println("Delete At specific position " + pos );
        if(head == null){
            return;
        } else if (pos == 1) {
            deleteAtFirst();
        } else{
            Node temp = head;
            Node pre = null;
            for(int i =1;i<pos-1;i++){
                pre = temp;
                temp  = temp.next;
            }

                temp.next = temp.next.next;
                temp.next.pre = temp;

        }
    }

    public void deleteAtLast(){
        System.out.println("Delete At Last - " + tail.value);
        if(head == null){
            return;
        }
        else{
            head.pre = tail.pre;
            tail.pre.next = head;
            tail = tail.pre;
        }
    }
    public int size(){
        Node temp = head;
        int count = 0;
        do{
            count++;
            temp = temp.next;
        }while(temp != head);
        return count;
    }
    public void print(){
        if(head == null){
            return;
        }
        Node temp = head;

        do{
            System.out.print(temp.value + " ");
            temp =  temp.next;
        }while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleCircularLinkedList dll = new DoubleCircularLinkedList();
        dll.insertAtFirst(1);
        dll.insertAtFirst(2);
        dll.insertAtFirst(3);
        dll.print();


        dll.insertAtLast(4);
        dll.insertAtLast(5);
        dll.print();

        dll.insertAtSpecificPosition(2,10);
        dll.print();
        dll.insertAtSpecificPosition(4,40);
        dll.print();
        dll.insertAtSpecificPosition(6,100);
        dll.print();


        dll.deleteAtFirst();
        dll.print();
        dll.deleteAtFirst();
        dll.print();

        dll.deleteAtLast();
        dll.print();
        dll.deleteAtLast();
        dll.print();

        dll.deleteAtSpecificPosition(2);
        dll.print();
        dll.deleteAtSpecificPosition(1);
        dll.deleteAtSpecificPosition(1);
        dll.print();


    }
}
