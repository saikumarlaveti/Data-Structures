package Practice;

public class Test1 {
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head = null;
    public boolean isEmpty(){
        return (head==null);
    }
    public void push(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
        }
        else{
            Node temp =head;
            head = node;
            node.next = temp;
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            return head.data;
        }
        return 0;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            int data = head.data;
            head = head.next;
            return data;
        }
        return 0;
    }
    public void print(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        else{
            Node temp  = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.push(1);
        t.push(2);
        t.print();
      //  System.out.println(t.peek());
        System.out.println(t.pop());
        t.push(3);
        t.push(4);
        t.print();
        System.out.println(t.pop());

    }
}
