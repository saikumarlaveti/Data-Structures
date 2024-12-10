public class Demo {

    public void sum(int[][] arr) {
        int leftsum = 0;
        int rightsum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    leftsum += arr[i][j];
                }
            }
        }
        System.out.println(leftsum);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == 2) {
                    rightsum += arr[i][j];
                }
            }
        }
        System.out.println(rightsum);
        System.out.println(leftsum + rightsum);
    }

    public void sum1(int[][] arr){
        int t1 = 0;

        int  sum = 0;
        int sum1 = 0;
        int t2 = 2;
        for(int i = 0;i<arr.length;i++){
                sum = sum + arr[i][i];
                sum1 += arr[i][t2];
                t2--;

        }
//            int t2 = 2;
//        for(int j = 0;j<arr.length;j++){
//            sum1 += arr[j][t2];
//            t2--;
//            }
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum + sum1);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        Demo d = new Demo();
        //d.sum(arr);
        d.sum1(arr);

    }
}
