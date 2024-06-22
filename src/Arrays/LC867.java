package src.Arrays;

import com.sun.jdi.connect.Connector;

import java.util.Arrays;

public class LC867 {
    public static void main(String[] args) {

//        transpose Matrix
        int [][]arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        output
//        [[1,4,7],
//        [2,5,8],
//        [3,6,9]]
//        so we can replace the opp elements except the diagonals one
        transposeMatrix(arr);
    }
    public static void transposeMatrix(int[][]arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = row+1; col < arr[row].length; col++) {
                int temp = arr[row][col];
                arr[row][col]= arr[col][row];
                arr[col][row] = temp;
            }
        }
        for(int[] a:arr){
            System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        }
    }
}

//more optimized appoach

//class Solution {
//    public int[][] transpose(int[][] matrix) {
//        int rowCount = matrix.length;
//        int colCount = matrix[0].length;
//
//        int[][] transposedMatrix = new int[colCount][rowCount];
//
//        for (int row = 0; row < rowCount; row++) {
//            for (int col = 0; col < colCount; col++) {
//                transposedMatrix[col][row] = matrix[row][col];
//            }
//        }
//
//        return transposedMatrix;
//    }
//}
//
