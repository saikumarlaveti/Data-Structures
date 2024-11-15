package Time_Complexity;

public class Example_1 {
    public static void main(String[] args) {
    Example_1 ex = new Example_1();
    int[] arr= {1,2,3,4,5};
    ex.sumAndProduct(arr);
    }
    public void sumAndProduct(int[] arr){
        int sum = 0; 
        int product = 1;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        for(int j = 0;j<arr.length;j++){
            product *= arr[j];
        }
        System.out.print("Sum- "+sum + " "+ "Product- " +product);

    }
}
