package src.Arrays;

import java.util.Arrays;

public class LC66 {
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        solution(digits);
    }

    static void solution(int[] digits){
        int count =0;
        int a = digits[digits.length-1];
        for (int i = 0; i < digits.length ; i++) {
            if (a < 9) {
                a++;
                System.out.println("Arrays.toString() = " + Arrays.toString(digits));
            }a=0;
        }

        System.out.println("digits.toString() = " + Arrays.toString(digits));
    }
}
