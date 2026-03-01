package List.Array.Problems;

public class maximum_number_of_1s_07 {
public   static  int rowWithMax1s(int mat[][]) {
        int max__ones = 0;
        int max_index = 0;

            for(int i = 0;i<mat.length;i++){
                int count = 0;
                for(int j = 0;j<mat[i].length;j++){
                    if(mat[i][j] == 1){
                        count++;
                    }
                }
                if(count>max__ones){
                    max__ones = count;
                    max_index = i;
                }

            }
        return max_index;
    }

    public static void main(String[] args) {
        int mat[][] = {
                {0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.println(rowWithMax1s(mat));
    }

}
