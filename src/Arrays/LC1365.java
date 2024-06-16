package src.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1365 {
    public static void main(String[] args) {

        int[] arr = {8, 1, 2, 2, 3};
        int[] ans = new int[arr.length];

        // Create a sorted copy of the array
//        1 2 2 3 8
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // Create a hashmap to store the count of smaller numbers
        Map<Integer, Integer> countMap = new HashMap<>();

//        store the value and the index no if it is absent in the map
        for (int i = 0; i < sortedArr.length; i++) {
            countMap.putIfAbsent(sortedArr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = countMap.get(arr[i]);
        }
        System.out.println(Arrays.toString(ans));





//        int[] arr = {8, 1, 2, 2, 3};
//        int[] ans = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] < arr[i]) {
//                    count++;
//                }
//            }
//            ans[i] = count;
//        }
//
//        System.out.println(Arrays.toString(ans));
    }
}
