package List.LinkedList.CircularSLL;

public class CircularSingleLL {
    public CircularNode head;
    public CircularNode tail;

    public void insertAtFirst(int value){
        CircularNode node = new CircularNode();
        node.value = value;
        if(head == null){
            head = node;
            tail = node;
            tail.next = head;
        }
        else {
            node.next = head;
            head = node;
            tail.next = node;
        }
    }


    public void insertAtLast(int value){
        if(head == null){
            insertAtFirst(value);
        }
        else{
            CircularNode node = new CircularNode();
            node.value = value;
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }

    public void insertAtSpecificLocation(int position,int value){
        int length = sizeOfLinkedList();
        if(position <=1|| head == null){
            insertAtFirst(value);
        }
        else if(length<position){
            insertAtLast(value);
        }
        CircularNode temp = head;
        int count = 0;
        while (count<position-1){
            temp = temp.next;
            count++;
        }
        CircularNode node = new CircularNode();
        node.value = value;
        node.next = temp.next;
        temp.next  = node;

    }

    public int sizeOfLinkedList(){
        int count;
        if(head == null){
            return 0;
        }
        else{
             count = 1;
            CircularNode temp = head;
            do{
                temp = temp.next;
                count++;
            }while(temp.next != head);
        }
        return count;
    }

    public void deleteAtFirstNode(){
        if(head == null){
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else  {
            head = head.next;
            tail.next = head;
        }
    }

    public void deleteAtMiddle(int position){
        if(head == null){
            return;
        }
        int count = sizeOfLinkedList();
        if(count < position){
            deleteAtLastNode();
        } else if (position == 1) {
            deleteAtFirstNode();
        } else{
            CircularNode temp = head;
            for(int  i = 1;i<position-1;i++){
                temp = temp.next;
            }
            System.out.println(temp.next.next.value);
            temp.next = temp.next.next;

        }
    }

    public void deleteAtLastNode(){
        if(head == null){
            return;
        }
        else if(head == tail){
            head = null;
            tail = null;
        }
        else{
            CircularNode temp = head;
           do{
               temp = temp.next;
           }while(temp.next != tail);
           tail = temp;
           tail.next = head;
        }
    }
    public void display(){
        if(head == null){
            return;
        }
        else{
            CircularNode temp = head;
            do{
                System.out.print(temp.value + " ");
                temp = temp.next;
            }while (temp != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularSingleLL csl = new CircularSingleLL();
        csl.insertAtFirst(3);
        csl.insertAtFirst(5);
        csl.display();
        csl.insertAtLast(10);
        csl.display();
        csl.insertAtFirst(20);
        csl.display();
        csl.insertAtLast(33);
        System.out.println(csl.sizeOfLinkedList());
        csl.insertAtSpecificLocation(2,37);
        csl.insertAtSpecificLocation(4,99);
        csl.display();
        System.out.println(csl.sizeOfLinkedList());
        System.out.println("=====Printing all nodes=====" );
        csl.display();
        System.out.println("=====Delete At first node=====");
        csl.deleteAtFirstNode();
        csl.display();
        System.out.println("=====Delete At Last node =====");
        csl.deleteAtLastNode();
        csl.deleteAtLastNode();
        csl.insertAtLast(8);
        csl.display();
        System.out.println("Delete At middle node");
        System.out.println(csl.sizeOfLinkedList());
        csl.deleteAtMiddle(2);
        csl.display();

    }
}
