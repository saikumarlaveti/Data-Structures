package Arrays.Number;

public class NineDivisors {
   public static int countDivisor(int n){
       int count = 0;
       for(int i  = 1;i<=n;i++){
           if(countNumber(i) == 9){
                count++;
           }
       }
       return count;
   }
   public static int countNumber(int num){
       int count = 0;
       for(int i = 1;i<=num;i++){
           if(num%i ==0)
               count++;
       }
       return count;
   }

    public static void main(String[] args) {
        System.out.println(countDivisor(100));
    }
}
