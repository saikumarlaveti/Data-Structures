package List.Array.SimpleArray;

import java.util.ArrayList;

public class DuplicateElements {
    public static void duplicateElement(int[] arr){
        boolean[] visited = new boolean[arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = false;
        for(int i = 0;i<arr.length-1;i++) {
            if (visited[i])
                continue;
            else {
                for (int j = i + 1; j <= arr.length-1; j++){
                    if (arr[i] == arr[j]) {
                        flag = true;
                        visited[j] = true;
                    }}
                if(flag) {
                    System.out.println("Duplicate Element :" + arr[i]);
                    list.add(arr[i]);
                    flag=false;
                }
            }
    }
        System.out.println(list);
    }

    public static void duplicateElement_1(int[] arr){

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,28,28,1000,1000,1000};
        duplicateElement(arr);

    }
}
