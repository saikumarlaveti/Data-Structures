package List.Array.Problems;

import java.util.HashMap;

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

    public static  int majorityElementHashMap(int[] arr){
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int  i = 0;i<arr.length;i++){
            if(count.containsKey(arr[i])){
                int frequent = count.get(arr[i]);
                count.put(arr[i],frequent+1);
            }
            else{
                count.put(arr[i],1);
            }
        }
        int maxElement = 0;
        int maxKey = 0;
        for(int key:count.keySet()){
            if(count.get(key)> maxElement){
                maxElement = count.get(key);
                maxKey = key;
            }
        }
        return maxKey;
    }


    public static void main(String[] args) {
        int arr[] = {1,3,1, 2,2,3,2 ,3, 5,3,1};
        System.out.println(majorityElement(arr));

        System.out.println(majorityElementHashMap(arr));

    }
}
