package LeetcodeConcepts.Recursion;

public class IncreaseOrder {
    public void printIncrease(int n)
    {
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        else {

            printIncrease(n-1);
            System.out.print(n+" ");

        }
    }
    public static int optimizedPower(int a,int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int half = optimizedPower(a,n/2);
        System.out.println(half);
         return half*half;
    }

    public static void main(String[] args) {
//        IncreaseOrder io = new IncreaseOrder();
//        io.printIncrease(10);

        int a  = IncreaseOrder.optimizedPower(2,4);
        System.out.println("return half square-"+a);
    }
}
