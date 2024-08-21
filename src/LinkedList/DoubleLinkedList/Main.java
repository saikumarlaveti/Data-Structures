package LinkedList.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {

        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertAtFirst(1);
        dll.insertAtLast(2);
        dll.insertAtFirst(3);
        dll.print();
        System.out.println();
        dll.insertAtMiddle(55,2);
        dll.print();

    }
}