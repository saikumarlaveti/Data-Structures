package Leetcode;

class  LC_876_MiddleOfTheLinkedList{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data  = data;
            next = null;
        }
    }
    ListNode head =null;
    public  void insertValue(int data) {
        ListNode ln = new ListNode(data);

        if (head == null) {
            head = ln;
        } else {
            ln.next = head;
            head = ln;
        }
    }

    public void print(){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp =temp.next;
        }
    }
    public int count(){
        int count = 0;
        if(head == null){
            return 0;
        }
        ListNode temp = head;
        while(temp != null){
            count++;
            temp  = temp.next;
        }
        return count;
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // The slow pointer will now be at the middle node
    }
    public static void main(String[] args) {
        LC_876_MiddleOfTheLinkedList ml = new LC_876_MiddleOfTheLinkedList();
        ml.insertValue(1);
        ml.insertValue(2);
        ml.insertValue(3);
        ml.insertValue(4);
        ml.insertValue(5);
        ml.print();
        System.out.println("count " + ml.count());

    }
}
