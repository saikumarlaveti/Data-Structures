package List.LinkedList.SingleLinkedList.Problems;

public class removeDuplicates_01 {

    public static class Node{
        public int value;
        public Node next;
    }

    public Node head;
    public Node tail;
    public void insertAtFirst(int value){
        Node node = new Node();
        node.value = value;
        if(head == null){
            head = node;
            tail = node;
        }
        else  {
            node.next = head;
            head = node;

        }
    }

    public void print(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public void removeDuplicate(){
        if(head == null || head.next == null){
            return;
        }
        else{
            Node temp_i = head;
            while(temp_i != null){
                Node prev = temp_i;
                Node temp_j = temp_i.next;
                while(temp_j != null){
                    if(temp_i.value == temp_j.value){
                        prev.next = temp_j.next;
                        if(temp_j.next ==null){
                            tail = prev;
                        }
                    }
                    prev = temp_j;
                    temp_j = temp_j.next;
                }
                temp_i = temp_i.next;
            }
        }
    }

    public void printHeadAndTail(){
        System.out.println("Head -" + head.value);
        System.out.println("Tail -"+tail.value);
    }

    public static void main(String[] args) {
        removeDuplicates_01 rd = new removeDuplicates_01();
        rd.insertAtFirst(3);
        rd.insertAtFirst(1);
        rd.insertAtFirst(2);
        rd.insertAtFirst(1);
        rd.insertAtFirst(3);
        rd.print();
        rd.printHeadAndTail();
        rd.removeDuplicate();
        rd.print();
        rd.printHeadAndTail();

    }
}
