
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
    }
    public static void deletion(int element){
        int arr[] = {1,2,3,4,5};
    }

    public static void main(String[] args) {
                Day_1.traversal();
                Day_1.insertion(2,40);
    }
}
