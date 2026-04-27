package List.Array.Problems;

public class GFG_09_FindMissingElement {
    public static int findMissingElement(int[] arr){
        int Element = -1;
        boolean flag = false;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<=arr.length;j++){
                if(arr[i] == j){
                    flag = true;
                }
            }
            if(!flag){
                Element = arr[i];
            }
        }
        return Element;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(findMissingElement(arr));
    }
}
