package SearchingTechiques;

public class LinearSearch
{
    public void lineSearch(int[] arr,int element){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == element){
                System.out.println(element + " is found At  " + i);
                return;
            }
        }
        System.out.println("Element not found");
        }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        LinearSearch ls = new LinearSearch();
        ls.lineSearch(arr,8);
    }
}

