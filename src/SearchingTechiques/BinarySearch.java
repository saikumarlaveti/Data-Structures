package SearchingTechiques;

public class BinarySearch {
public void binary(int[] arr,int key){
    int mid;
    int low = 0;
    int high  = arr.length-1;
    while(low<=high){
        mid = (low + high)/2;
        if( arr[mid] == key ){
            System.out.println("Key fount  at :" + mid );
            return ;
        } else if ( arr[mid] > key ) {
            high = mid -1;
        }
        else
            low = mid +1;
    }
}
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        BinarySearch bs = new BinarySearch();
        bs.binary(arr,1);
        bs.binary(arr,9);
}
}
