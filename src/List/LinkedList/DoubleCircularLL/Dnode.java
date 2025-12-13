package List.LinkedList.DoubleCircularLL;

public class Dnode {
    Dnode prev;
    int data;
    Dnode next;
    Dnode(int data)
    {
        this.data = data;
        prev = null;
        next = null;
    }
}
