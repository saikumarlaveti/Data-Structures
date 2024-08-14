package LinkedList.SingleLinkedList;

import java.util.Scanner;

class SLinkedList
{
    class Node
    {
        int data;
        Node next;

        Node (int data)
        {
            this.data = data;
            next = null;
        }
    }
    Node head = null;
    SLinkedList()
    {
        head = null;
    }
    void insertAtFirst(int data)
    {
        Node n = new Node(data);
        if(head != null)
                n.next = head;
        head = n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLinkedList sl = new SLinkedList();
        sl.insertAtFirst(1);
    }
}
