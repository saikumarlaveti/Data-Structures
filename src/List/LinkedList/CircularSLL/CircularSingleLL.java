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
    }
}
