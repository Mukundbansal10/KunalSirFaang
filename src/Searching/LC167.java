package src.Searching;

import java.util.Arrays;

public class LC167 {
    public static void main(String[] args) {

        int[] numbers = {2,7,11,15,4,3};
        int target = 9;

        int i= 0;
        int j = numbers.length - 1;
        int sum;
        while (i < j) {
            sum = numbers[i] + numbers[j];
            if (sum == target)
                System.out.println(Arrays.toString(new int[]{i + 1, j + 1}));
            else if (sum < target) i++;
            else j--;
        }

    }








//        for (int counter = 0; counter <= numbers.length; counter++) {
//            for (int i = 0; i < numbers.length; i++) {
//                for (int j = 1; j < numbers.length; j++) {
//                    if ((numbers[i] + numbers[j]) == target && numbers[i]!=numbers[j]) {
//                        System.out.println(numbers[i] + " " + numbers[j]);
//
//                    }
//                }
//            }
        }




//                if ((numbers[i] + numbers[i + 1]) == target) {
//        System.out.println(numbers[i] + " " + numbers[i + 1]);
//
//
//                }
