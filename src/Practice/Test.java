package Practice;

import com.sun.security.jgss.GSSUtil;

public class Test {
    int arr[];
    int index = -1;
    public void inialization(int length){
        arr = new int[length];
    }
    public boolean isEmpty(){
        return index == -1;
    }
    public boolean isFull(){
        return index == arr.length-1;
    }
    public void push(int element){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        else{
            arr[++index] = element;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            return arr[index];
        }
        return 0;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            int p = arr[index];
            index--;
            return p;
        }
        return 0;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            for(int i = 0;i<=index;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.inialization(5);
        t.push(1);
        t.print();
        System.out.println(t.isFull());
        t.push(2);
        t.push(3);
        t.push(4);
        t.push(5);
        t.print();
        System.out.println(t.isFull());
        System.out.println(t.isEmpty());

    }
}
