import java.util.Scanner;

class Solution{
    static int[] arr;
    static int index =-1;
    public static void stackImpl(int[] arr){
        /*
        1.push( )
        2.pop ( )
        3.peek( )
        4.isEmpty( )
        */
          }

          //push ()
    public static void stackPush(int element) {
        if(arr.length-1 == index){
            System.out.println("Stack is Full ");
        }
        arr[++index] = element;

    }

    //pop()
    public  static void stackPop(){
        if(index ==-1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Poped element is " + arr[index]);
        index--;
    }

    //peek()
    public static int statckpeek(){
        if(index == -1){
            return -1;
        }
        System.out.println("peek element is " + arr[index]);
        return arr[index];
    }

    //isEmpth()
    public static boolean stackIsEmpty(){
        return index == -1;
    }

    //print Stack
    public static void printStack(){
        for(int i = 0;i<=index;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the stack :: ");
        int length = sc.nextInt();
        arr = new int[length];
        System.out.println("How many operations : ");
        int operations = sc.nextInt();
        for(int i = 0;i<operations;i++) {
            System.out.println("\nChoose your option :  \n 1.push() \n 2.pop() \n 3.peek() \n 4.isEmpty() \n 5.print()");
            int option = sc.nextInt();
            switch (option) {
                //push ()
                case 1: {
                    System.out.print("Enter element ");
                    int element = sc.nextInt();
                    stackPush(element);
                    break;
                }
                //pop ()
                case 2: {
                    stackPop();
                    break;
                }
                case 3: {
                    System.out.println(statckpeek());
                    break;
                }
                case 4: {
                    System.out.println(stackIsEmpty());
                    break;
                }
                case 5: {
                    printStack();
                    break;
                }
                default:{
                    System.out.println("Invalid Choose");
                }
            }
        }
    }
}