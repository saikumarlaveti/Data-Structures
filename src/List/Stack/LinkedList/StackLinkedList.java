package List.Stack.LinkedList;


public class StackLinkedList {
    Node head;
    StackLinkedList()
    {
        Node head  = null;
    }
    public void push(int data){
        Node s = new Node(data);
        Node temp = head;
        if(temp != null)
        {
            head = s;
            s.next = temp;
        }
        head = s;
        System.out.println("pushed Element is -"+data);
    }

    public int  pop()
    {

        if(head == null)
        {
            System.out.println("Stack is Empty");
        }
        else {
            int popped = head.data;
            head = head.next;
            return popped;
        }
        return 0;
    }

    public void peek()
    {
        if(head == null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            Node t = head;
            System.out.println("peek element- "+t.data);
        }
    }

    public void display()
    {
        System.out.println("Printing the Elements");
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackLinkedList sll = new StackLinkedList();
        sll.push(1);
        sll.push(2);
        sll.push(3);

        sll.display();
        int a = sll.pop();
        if(a>0)
        {
            System.out.println("Element popped - "+ a);
        }
        sll.display();
        sll.peek();
        sll.push(40);
        sll.display();

    }
}
