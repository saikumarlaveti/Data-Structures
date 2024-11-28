class Test{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static Node  head;
    Node tail;
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }
    }
    public void insertAtMiddle(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (head == null || position == 1) {
            insertAtFirst(data); // Handle insertion at the start or empty list case
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        // Traverse to the node just before the desired position
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){
        head = newNode;
        tail = newNode;
        newNode.next = head;
    }
        else{
    tail.next = newNode;
    newNode.next = head;
    tail = newNode;
    }}
    public  void display(){
        if(head == null){
            System.out.println("Circular Linked List is Empty ");
        }
        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while (temp != head);
        System.out.println();
    }
    public void count(){
        int count = 1;
        Node temp = head;
        while (temp.next != head){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }
    public void reverse(Node current){
        if(current.next == head ){
            System.out.print(current.data+" ");
            return;
        }
        else {
            reverse(current.next);
            System.out.print(current.data+" ");
        }
    }

    public void deleteAtFirst(){
        if(head == null){
            System.out.println("circular linked list is Empty");
        }
        else{
            head = head.next;
            tail.next = head;
        }
    }
public void deleteAtMiddle(int position){
      if(head == null){
          System.out.println("List is Empty");
      }  if (position == 1) {
            deleteAtFirst();
            return;
      }
      Node temp = head;
      Node current = null;
      for(int i = 0;i<position;i++){
          current = temp;
          temp = temp.next;
      }
      if(current != null){
          current.next = temp.next;
          temp = null;
      }
}
    public void deleteAtLast() {
        if (head == null) {
            System.out.println("Circular linked list is empty");
        }
        else {
                Node currentNode  = head;
                while(currentNode.next != tail){
                    currentNode = currentNode.next;
                }
                tail = currentNode;
                tail.next = head;
            }
        }

        public void minAndMax(){
        Node temp = head;
        int min = temp.data, max = temp.data;
            do {
                if (temp.data < min) {
                    min = temp.data;
                }
                if (temp.data > max) {
                    max = temp.data;
                }
                temp = temp.next;
            } while (temp != head);
            System.out.println("Min -" + min + " Max -" + max);
        }

        public void search(int data){
            if(head == null){
                System.out.println("List is Empty");
            }
            else{
                int count =1;
                Node temp = head;
                do{
                    if(temp.data == data){
                        System.out.println("Element found at :" + count);
                        break;
                    }
                    count++;
                    temp = temp.next;
                    if(temp == tail.next){
                        System.out.println("Element not found");
                    }
                }while (temp != tail.next);
            }
    }

    public void sort(){
        Node current = head;
        Node index = null;
        do{
            index = current.next;
            while(index.next != head){
                if(current.data > index.data){
                    int t = current.data;
                    current.data = index.data;
                    index.data = t;}
                index = index.next;
            }
            current = current.next;
        }while (current.next != head);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.insertAtFirst(1);
        test.insertAtLast(2);
        test.insertAtLast(3);

        test.insertAtMiddle(55,2);
        test.insertAtLast(100);


        test.display();
        test.search(3);
        test.insertAtLast(4);
        System.out.println("Sorting");
        test.sort();
        test.display();
    }
}