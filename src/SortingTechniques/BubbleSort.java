package SortingTechniques;

class BubbleSort{
    public void Sorting (int[] arr){
        boolean swipped;
        for(int i  =0;i < arr.length;i++){
            swipped = false;
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int  temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swipped = true;
                    for(int k: arr){
                        System.out.print(k + " ");
                    }
                    System.out.println();
                }
            }
            if(swipped == false){
                break;
            }
        }
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,12,9,11,2};
        BubbleSort bs = new BubbleSort();
        bs.Sorting(arr);

    }
}