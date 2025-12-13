package LeetcodeConcepts.Recursion;

public class Factorial {
    public static int findFactorial(int n)
    {
        if(n==0 ){
            return 1;
        }
        else {

            return n*findFactorial(n-1);
        }
    }
    public static int sumNaturalNumber(int n){
        if(n==1)
            return 1;

        else
          return   n + sumNaturalNumber(n-1);

    }


    public static int fibnacci(int n){
        if(n == 0 || n == 1)
        {
            return n;
        }
        else {
          return fibnacci(n-1)+fibnacci(n-2);
        }
    }

    public static void even(int n)
    {
        if(n<2)
        {
            return ;
        }
      even(n-1);
        if(n%2==0)
        {
            System.out.print(n+" ");
        }
    }

    public static void odd(int n)
    {
        if(n<=0)
            return ;
        odd(n-1);

        if(n%2==1)
        {
            System.out.print(n+" ");
        }
    }

    public static void fabnocciSerices(int a,int b)
    {
        int count = 1;
        int c;
        while(count<=5)
        {
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
            count++;
        }
    }
    static int a = 0 ,b = 1, c = 0;
    public static void fibsercies(int n)
    {
        int count = n;
       if(count>0)
       {
           c = a+b;
           System.out.print(c+" ");
           a = b;
           b = c;
           fibsercies(n-1);
       }
    }



    public static boolean sortedArray(int[] arr)
    {
        boolean res = false ;
        for(int i = 0;i<arr.length-1;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                res = true;
            }
            else {
              return false;
            }
        }
        return  res;
    }


    public static boolean sortedARR(int[] a,int i)
    {
        if(i==a.length-1)
            return true;
        else {
            if(a[i]>a[i+1]){
                return false;
            }
            sortedARR(a,i+1);
        }
        return true;
    }
    public static int firstOccurence(int[] arr,int i,int key)
    {
        if(i>arr.length-1)
        {
            return -1;
        }
        else {
            if(arr[i]==key){
                return i;
            }
            else {
            return     firstOccurence(arr,i+1,key);
            }
        }
    }

    public static int lastOccurence(int[] arr,int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }

            int found = lastOccurence(arr,key,i+1);
            if(found == -1 && arr[i]==key)
            {
                return i;
            }
            return found;
    }

    public static void main(String[] args) {
//        System.out.println(Factorial.findFactorial(5));
//        System.out.println(Factorial.sumNaturalNumber(5));
//        System.out.println(Factorial.fibnacci(25));
//        even(10);
//        System.out.println();
//        Factorial.odd(10);

//        System.out.print(0+" "+1+" ");
//        Factorial.fibsercies(5);

//        int[] array  = {1,2,3,4,5};
//        if(Factorial.sortedArray(array)){
//                System.out.println("Sorted Array ");
//        }
//        else{
//            System.out.println("not a sorted array");
//        }
//
//
//        if(Factorial.sortedARR(array,0)){
//            System.out.println("Sorted Array ");
//        }
//        else{
//            System.out.println("not a sorted array");
//        }
//        int[] arr  = {1,2,3,4,5};
//      int i =   Factorial.firstOccurence(arr,0,5);
//      if(i>=0)
//      {
//          System.out.println("Element found at index number "+i);
//      }
//      else {
//          System.out.println("Element not found");
//      }
//        int[] arr  = {1,2,3,4,5,2,3};
//        int key = 3;
//        int  i = Factorial.lastOccurence(arr,key,0);
//        System.out.println(i);




   }
}
