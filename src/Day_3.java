public class Day_3 {
    public static int search(int arr[],int element){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == element){
                return  i;
            }
        }
        return 0;
    }
    public static void update(int arr[],int position,int updateElement){
        arr[position] = updateElement;
        for(int a :arr){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
       int res  =  Day_3.search(arr,2);
       if(res >=0){
           System.out.println("Element found at index "+res);
       }
       else {
           System.out.println("Element not found");
       }
       Day_3.update(arr,0,40);
    }
}
