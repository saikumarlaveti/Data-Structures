package List.Array;

public class FindHighestNumbers_01 {
    public static int firstHighestNumber(int[] number){
        int high = 0;
        for(int i  = 0;i<number.length;i++){
                if(number[high] < number[i])
                    high = i;
        }
        return number[high];
    }

    public static int secondHighestNumber(int[] number){
        int high = 0;
        for(int i  = 0;i<number.length;i++){
            if(number[high] < number[i])
                high = i;
        }
        int second = 0;
        for(int j = 0;j<number.length;j++){
            if(number[high]>number[j] && number[second]<number[j]){
                second = j;
            }
        }
        return number[second];
    }

    public static int secondHighestNumber_method_2(int[] number){
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int num : number){
            if(num>firstmax){
                secondmax = firstmax;
                firstmax = num;
            } else if (num>secondmax && num != firstmax) {
                secondmax = num;
            }
        }

        return secondmax;
    }

    public static int ThirdHighestNumber(int[] number){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int num: number){
            if(num>firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num>secondMax && num != firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            }
            else if(num>thirdMax&& num != secondMax && num != firstMax){
                thirdMax = num;
            }
        }
        System.out.println(firstMax);
        System.out.println(secondMax);
        System.out.println(thirdMax);
        return thirdMax;
    }
    public static void main(String[] args) {
        int[] arr  = { 10,3,8,9,4};
//        System.out.println(firstHighestNumber(arr));
//        System.out.println(secondHighestNumber(arr));
//        System.out.println(secondHighestNumber_method_2(arr));
        System.out.println(ThirdHighestNumber(arr));
    }
}
//String.valueOf(score[i]);