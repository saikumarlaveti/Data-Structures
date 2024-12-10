class Node{
    Node prev;
    int data;
    Node next;
    Node (int data){
        this.data = data;
        prev = null;
        next = null;
    }
}
class Test{
    Node head = null;
    Node tail = null;
    public void insert(int data){
        Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
    }
    else{
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data  == data){
                System.out.println("Element is Found ");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element not Found");
    }

    public void deleteAtFirst(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
        head = head.next;
            if (head != null) {
                head.prev = null;
            }
    }
    }

    public void deleteAtMiddle(int data) {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;
            Node prev = null;
            while (temp.data != data) {
                prev = temp;
                temp = temp.next;
            }
            if (temp.next != null) {
                prev.next = temp.next;
                temp.next.prev = prev;
            }
            else {
                prev.next = null;
            }
        }
    }
    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            if (head != tail) {
                tail = tail.prev;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void minAndMax(){
        if(head == null)
            System.out.println("List is Empty");
        else{
            int min = head.data;
            int max = head.data;
            Node temp = head;
            while(temp != null){
                if(min > temp.data){
                    min = temp.data;
                }
                if(max < temp.data){
                    max  = temp.data;
                }
                temp = temp.next;
            }
            System.out.println("Min " + min + " " + " max " + max);
        }
    }

    public void count(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        System.out.println(count);
    }

    public void reverse(Node head){
        if(head == null){
            return;
        }
                reverse(head.next);
                System.out.print(head.data + " ");

        }
public static void main(String[] args) {
        Test t = new Test();
        t.insert(2);
        t.insert(3);
        t.insert(4);
       // t.insert(5);
        t.display();
        //t.minAndMax();
     //   t.count();
        t.reverse(t.head);
        for(int i = 1;i<=25;i++){
            System.out.println("Web- " + i);
        }

    }
}