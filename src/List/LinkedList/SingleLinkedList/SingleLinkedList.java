package List.LinkedList.SingleLinkedList;

public class SingleLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public void insertElementAtFirst(int value){
        size++;
        Node node = new Node();
        node.value = value;
        node.next = null;

        if(head == null){
            head = node;
            tail  = node;
        }
        else{
            node.next  = head;
            head = node;
        }
    }

    public void insertElementAtGivenPosition(int value,int position){
        if(size<position){
            insertElementAtLast(value);
        }
        else if(position == 1){
            insertElementAtFirst(value);
        }
        else{
            int count = 1;
            Node temp = head;
            Node pre = null;
            while(temp != null){
                count++;
                pre = temp;
                temp = temp.next;
                if(count == position){
                    Node node = new Node();
                    node.value = value;
                    node.next = pre.next;
                    pre.next = node;
                }
            }
        }
    }

    public void insertElementAtLast(int value){
       size++;
        Node node = new Node();
       node.value = value;
       node.next = null;

       if(head == null){
           head = node;
           tail = node;
       }
       else{
           tail.next = node;
           tail = node;
       }
    }

    public boolean searchElement(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void deleteAtFirstElement() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    public void deleteAtMiddleElement(int position){
        int size = fineLength();
        if(size<position){
            System.out.println("position greater than length of the linked list");
        } else if (position == 1) {
            deleteAtFirstElement();
        }
        else{
            Node temp = head;
            Node pre = null;
            int count = 0;
            while(temp != null){
                count++;
                if(count == position){
                    pre.next = temp.next;
                    break;
                }
                pre = temp;
                temp = temp.next;
            }
        }
    }
    public void deleteAtLastElement(){
        if(head == null){
            return;
        }
        Node temp = head;
        Node pre = null;
        while(temp.next != null){
                pre = temp;
                temp = temp.next;

        }
        tail = temp;
        pre.next = null;
    }

    public int fineLength(){
        int count =0;
        if(head == null){
            return 0;
        }
        else {
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
        }
        return count;
    }
    public void display(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.insertElementAtLast(3);
        sll.insertElementAtLast(5);
      //  sll.display();
        sll.insertElementAtFirst(2);
     //   sll.display();
        sll.insertElementAtLast(10);
        //sll.display();
        sll.insertElementAtGivenPosition(7,1);
        sll.insertElementAtGivenPosition(9,6);
        sll.display();
        System.out.println(sll.searchElement(10));
        sll.deleteAtFirstElement();
        sll.display();
        System.out.println("Delete At First Element");
        sll.deleteAtFirstElement();
        sll.display();

        //delete At Last Element
        System.out.println("Delete At Last Element");
        sll.deleteAtLastElement();
        sll.display();
        System.out.println(sll.fineLength());
        sll.deleteAtMiddleElement(2);
        sll.display();
        sll.deleteAtMiddleElement(2);
        sll.display();
        sll.deleteAtMiddleElement(1);
        sll.display();
    }
}




































