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

    public void display(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
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
        sll.insertElementAtGivenPosition(9,3);
        sll.display();
    }
}




































