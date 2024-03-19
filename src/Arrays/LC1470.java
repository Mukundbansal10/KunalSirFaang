package src.Arrays;

import java.util.Arrays;

public class LC1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }
}

class Main2{
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,3,6,8,7};
        int n = 3;
        LC1470 lc1470 = new LC1470();
        int[] shuffle = lc1470.shuffle(nums, n);
        System.out.println("Arrays.toString(shuffle) = " + Arrays.toString(shuffle));
    }
}
