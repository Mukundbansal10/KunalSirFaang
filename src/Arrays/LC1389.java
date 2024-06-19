package src.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1389 {

    public static void createArray(int[] nums, int[] index) {

//        approach 1

        int[] target = new int[nums.length];
        int size = 0;

        for (int i = 0; i < nums.length; i++) {
            int idx = index[i];
            if (idx < size) {
                // Shift elements to the right
                System.arraycopy(target, idx, target, idx + 1, size - idx);
            }
            target[idx] = nums[i];
            size++;
        }
        System.out.println("Arrays.toString(target) = " + Arrays.toString(target));






//        approach 2

//        List<Integer> targetList = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            targetList.add(index[i], nums[i]);
//        }
////        convert list to Array
//        int[] target = targetList.stream().mapToInt(Integer::intValue).toArray();
//        System.out.println("Arrays.toString(target) = " + Arrays.toString(target));


    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        createArray(nums, index);

    }}

