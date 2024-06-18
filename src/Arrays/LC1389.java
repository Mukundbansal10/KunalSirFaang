package src.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1389 {

    public static void createArray(int[] nums, int[] index) {

        List<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }
//        convert list to Array
        int[] target = targetList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Arrays.toString(target) = " + Arrays.toString(target));


    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        createArray(nums, index);

    }
}
