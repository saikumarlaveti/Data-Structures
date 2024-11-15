package SortingTechniques;

public class Count {
    //Find miximum Element
    public int mix(int[] arr){
        int mix = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(mix<arr[i])
                mix = arr[i];
        }
        return mix;
    }

    public void technique(int[] arr){
        int[] output = new int[arr.length];
        int mix = mix(arr);
        //Creating an array size of mix+1
        int[] count = new int[mix+1];

        //all indexes filled with 0's
        for(int i =0;i<count.length;i++){
            count[i] = 0;
        }

        // checking frequency
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //display(count);
//count
        for(int i = 1; i<=mix; i++)
            count[i] =count[i] + count[i-1];
    //display(count);
    int n = arr.length;
        for(int i = n - 1; i >= 0; i--){
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;  // decrement after placing element
        }

        for(int i = 0;i<n;i++){
        arr[i] =output[i];
    }
    display(arr);
    }



    public void display(int[] dis){
        for(int a:dis){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {5,3,1,2,4,3};
        Count c = new Count();
        c.display(a);
        c.technique(a);
    }
}
