package List.Array.Problems;

public class GFG_08_Majority_Element {

    public static int majorityElement(int[] arr){
        int Element_count  = 0;
        int Element = 0;
        boolean[] frequence = new boolean[arr.length];
        for(int i = 0;i<arr.length;i++){
            int temp = 1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j] && !frequence[i]){
                    temp++;
                    frequence[j] = true;
                }
            }
            if(Element_count<temp){
                Element_count = temp;
                Element = arr[i];
            }
        }
        return Element;
    }


    public static void main(String[] args) {
        int arr[] = {1,3,1, 2,2,3,2 ,3, 5,3,1};
        System.out.println(majorityElement(arr));
    }
}
