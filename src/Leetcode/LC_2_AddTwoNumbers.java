package Leetcode;
//
//class Node{
//    int data;
//    Node next;
//    Node (int data){
//        this.data = data;
//        this.next  = null;
//    }
//}

public  class LC_2_AddTwoNumbers {


    public   class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
     ListNode  head = null;
    public ListNode insertNode(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
        }
        else {
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return newNode;
    }

    public void printNode(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        LC_2_AddTwoNumbers outer = new LC_2_AddTwoNumbers();

        ListNode dummy = outer.new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while(l1 != null || l2  != null || carry !=0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            current.next = outer.new ListNode(sum%10);
            current = current.next;

        }

        return dummy.next;
    }
    public static void main(String[] args) {
        LC_2_AddTwoNumbers list1 = new LC_2_AddTwoNumbers();

        //First Linked List
        list1.insertNode(2);
        list1.insertNode(4);
        list1.insertNode(3);
        list1.printNode(list1.head);

        // Second Linked List
        LC_2_AddTwoNumbers list2 = new LC_2_AddTwoNumbers();
        list2.insertNode(5);
        list2.insertNode(6);
        list2.insertNode(4);
        list2.printNode(list2.head);

        ListNode head = addTwoNumbers(list1.head,list2.head);

        LC_2_AddTwoNumbers outer = new LC_2_AddTwoNumbers();
        outer.printNode(head);



    }
}


