package List.LinkedList.DoubleCircularLL;

public class DoubleCirLinkedList {
   Dnode head;
   Dnode tail;
   DoubleCirLinkedList(){
       head = null;
       tail = null;
   }
   public void insertAtFirst(int data)
   {
       Dnode  newnode = new Dnode(data);

       if(head == null)
       {
           head = tail = newnode;
           head.next = head.prev = head;
       }
       else {
           newnode.next = head;
           newnode.prev = tail;

           head.prev = newnode;
           tail.next = newnode;

           head = newnode;

       }
   }

   public void insertAtMiddle(int data,int pos) {
       Dnode newnode = new Dnode(data);
       if (head == null) {
           head = newnode;
           tail = newnode;
           head.prev = head.next = newnode;
           return;
       }
       if (pos == 1) {
           insertAtFirst(data);
       }
       else{
           int count = 1;
           Dnode temp= head;
           while(temp.next != head && count < pos-1){
               count++;
               temp  = temp.next;
           }
           newnode.next = temp.next;
           newnode.prev = temp;

           temp.next.prev = newnode;
           temp.next = newnode;


           if(count >= pos && temp == head ){
               tail = newnode;

           }
       }
       }
    public void insertAtLast(int data){
        Dnode newnode = new Dnode(data);
        if(head == null)
        {
            head = tail = newnode;
            head.prev = head.next = newnode;
        }
        else
        {
            newnode.prev = tail;
            newnode.next = head;

            tail.next = newnode;
            head.prev = newnode;

            tail = newnode;
        }
    }

    public void deleteAtFirst()
    {
     Dnode temp = head;

     head = temp.next;
     tail.next = head;
     temp.next = null;
     tail.prev = null;
    }

    public void deleteAtmiddle(int pos)
    {
        int count = 1;
        Dnode temp = head;
        Dnode previous  = null;
        while(temp.next != head && count <pos)
        {
            previous = temp;
            count++;
            temp = temp.next;
        }
        previous.next = temp.next;
        temp.next = temp.prev = null;
    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Dnode temp = tail;
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;

        }
    }


    public void disney()
   {
       Dnode temp = head;
       do{
           System.out.print(temp.data+" ");
         temp  =   temp.next;
       }while (temp != head);
       System.out.println();
   }


    public static void main(String[] args) {
       DoubleCirLinkedList dcll = new DoubleCirLinkedList();
        System.out.println("Insert At first position");
        dcll.insertAtFirst(1);
        System.out.println("Insert At first position");
        dcll.insertAtFirst(2);
        System.out.println("Insert At first position");
        dcll.insertAtFirst(3);
       dcll.disney();
        System.out.println("Insert At middle position");
        dcll.insertAtMiddle(109,3);
       dcll.disney();
        System.out.println("Insert At last position");
       dcll.insertAtLast(200);
       dcll.disney();
        System.out.println("Insert At last position");
        dcll.insertAtLast(300);
        dcll.disney();
        System.out.println("Delete At first position");
        dcll.deleteAtFirst();
        dcll.disney();
        System.out.println("Delete At middle position");
        dcll.deleteAtmiddle(2);
        dcll.disney();

        System.out.println("Delete At Last Position");
        dcll.deleteAtLast();
        dcll.disney();
    }
}
