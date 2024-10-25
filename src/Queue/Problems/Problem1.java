package Queue.Problems;


import java.util.Stack;

// Implementation Queue Using stack
public class Problem1 {

    static Stack<Integer> s1 =  new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public boolean isEmpty(){
        return s1.isEmpty();
    }
    //add or push
    public void add(int data)
    {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    // remove or pop
    public int remove()
    {
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            return s1.pop();
        }
    }

// top most element or peek
    public int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            return s1.peek();
        }
    }

    public static void main(String[] args) {
            Problem1 p = new Problem1();
            p.add(1);
            p.add(2);
            p.add(3);

            while (!p.isEmpty()){
                System.out.print(p.peek()+" ");
                p.remove();
            }

    }
}
