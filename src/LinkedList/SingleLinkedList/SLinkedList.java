package LinkedList.SingleLinkedList;

import java.util.Scanner;

class SLinkedList
{
    //creation of Node
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
        {
                n.next = head;
        }
        head = n;
    }
    void display(){
        Node t = head;
        while(t != null)
        {
            System.out.print(t.data+" \t");
            t=t.next;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLinkedList sl = new SLinkedList();
        sl.insertAtFirst(1);
        sl.insertAtFirst(25);
        sl.display();
    }
}
