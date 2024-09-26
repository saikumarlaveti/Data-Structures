package SearchingTechiques;

public class LinearSearch
{
    public void lineSearch(int[] arr,int element){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == element){
                System.out.println("Element is found ");
                break;
            }
            else {
                System.out.println("Element is not found");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,34,5,6,7,8,9};
        LinearSearch ls = new LinearSearch();
        ls.lineSearch(arr,8);
    }
}
