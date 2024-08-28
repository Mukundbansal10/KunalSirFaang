package src.Arrays;

public class LC1572 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        diagonalSum(mat);
    }
    static void diagonalSum(int[][]mat){
        int rowCount= mat.length;
        int Colcount = mat[0].length;

        int add=0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < Colcount; j++) {
                if(i==j || i+j==rowCount-1){
                    add+=mat[i][j];
                }
            }
        }
        System.out.println(add);
    }
}
