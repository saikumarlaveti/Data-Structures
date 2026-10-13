class Practice{
    public  static int maxOfConsecutiveElements(int[] arr,int k){
        int max ;
        int sum = 0;
        for(int i= 0;i<=arr.length-k;i++){
            max = 0;
            for(int j = i;j<k+i;j++){
                max += arr[j];
            }
            sum = Math.max(max,sum);
        }
        return sum;
    }

    public static int slidingWindow(int[] arr, int k){
        int max = 0;
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum += arr[i];
        }
        for(int i =k;i<arr.length;i++){
            sum = sum - arr[i-k]+arr[i];
            max  = Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4};
        System.out.println(maxOfConsecutiveElements(arr,3));
        System.out.println(slidingWindow(arr,3));
    }
}