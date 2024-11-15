class Test{
    class Node {
        int data;
        Node next;
        Node (int data){
            this.data = data;
            next = null;
        }
    }
    Node head;
    Node tail;
    public void insertAtAdd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            newNode .next = newNode;
        }
        else{

            newNode.next = head;
            tail.next  = newNode;
            tail  = newNode;

        }
    }
    public void display(){
        Node temp = head;

        do{
            System.out.print(temp.data +" ");
            temp = temp.next;
        } while(temp != head);

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.insertAtAdd(1);
        t.insertAtAdd(2);
        t.insertAtAdd(3);
        t.display();
    }
}