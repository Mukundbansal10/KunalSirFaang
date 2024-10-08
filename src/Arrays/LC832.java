package src.Arrays;

import java.util.Arrays;

public class LC832 {
    public static void main(String[] args) {

        //        int[][] image = {
//                {1,1,0},
//                {1,0,1},
//                {0,0,0}
//        };
        int[][] image ={

                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };


        flipImage(image);
    }
    static void flipImage(int[][] image){
        for (int i = 0; i < image.length; i++) {

            int left = 0;
            int right = image[i].length-1;
            while (left<right){
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j]=1;
                }else image[i][j]=0;
            }
        }

        System.out.println();
        System.out.println(Arrays.deepToString(image));

    }
}
