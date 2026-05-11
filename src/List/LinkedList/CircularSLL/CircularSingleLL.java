package List.LinkedList.CircularSLL;

public class CircularSingleLL {
    public CircularNode head;
    public CircularNode tail;

    public void insertAtFirst(int value){
        CircularNode node = new CircularNode();
        if(head == null){
            node.value = value;
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            node.value = value;
            head = node;
        }
    }

    public static void main(String[] args) {
        CircularSingleLL csl = new CircularSingleLL();
        csl.insertAtFirst(3);
    }
}
