
public class Day_1
{
    public static void traversal(){
        int arr[] =  {1,2,3,4,5};
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertion(int pos,int value)
    {
        int arr[] = {1,2,3,4,5};
        int brr[] = new int  [arr.length+1];

        if(pos>arr.length || pos<0){
            System.out.println("Invalid output");
        }
        else{
        for(int i = 0;i<pos-1;i++){
            brr[i] = arr[i];
        }
        brr[pos-1] = value;
        for(int i = pos-1;i<arr.length;i++){
            brr[i+1] = arr[i];
        }}
        for(int a :brr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void deletion(int pos){
        int arr[] = {1,2,3,4,5};
        int brr[] = new int[arr.length-1];
        if(pos<0 || pos > arr.length){
            System.out.println("Invalid position");
        }
        else{
        for (int i = 0 ;i<pos-1;i++){
             brr[i] = arr[i];
        }
        for(int j = pos;j<arr.length;j++){
            brr[j-1] = arr[j];
        }}
        for(int a :brr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static void delete1(int pos){
        int arr[] = {1,2,3,4,5};
        for(int i = pos-1;i< arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        for(int i = 0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
                Day_1.traversal();
                Day_1.insertion(2,40);
                Day_1.deletion(3);
                Day_1.delete1(3);
    }
}
