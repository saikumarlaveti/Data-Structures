package LinkedList.DoubleCircularLL;

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

   public void insertAtMiddle(int data,int pos)
   {
       Dnode  newnode = new Dnode(data);
       if(head == null)
       {
       head = newnode;
       tail = newnode;
       head.prev=head.next = newnode;
       }
       else
       {
           int count = 1;
           Dnode temp = head;
           Dnode prevs = null;
           while(temp.next != head && count <pos){
               prevs = temp;
               temp = temp.next;
               count++;
           }
           newnode.prev = prevs.next;
           newnode.next = temp.prev;

           prevs.next = temp.prev;
           prevs.prev = prevs.next;
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
       dcll.insertAtFirst(1);
       dcll.insertAtFirst(2);
       dcll.disney();
       dcll.insertAtMiddle(109,2);
       dcll.disney();

    }
}
