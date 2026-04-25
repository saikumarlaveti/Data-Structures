package LeetcodeConcepts.Recursion;

public class SumOfDigits {
    public int sumofDigits(int sum,int number){
        if(number<0){
            return 1;
        }
        else if(number ==0 || number ==1){
            return sum;
        }
        else{
            sum += number%10;
           return sumofDigits(sum,number/10);
        }
    }


    public int sumOfDigitsIterations(int sum,int  number){
       while(number>0){
                sum += number%10;
                number/=10;
            }

        return sum;
    }
    public static void main(String[] args) {
        SumOfDigits sod =new SumOfDigits();
        System.out.println(sod.sumofDigits(0,234));
        System.out.println(sod.sumOfDigitsIterations(0,234));
    }
}
