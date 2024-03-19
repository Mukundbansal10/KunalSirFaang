package src.Arrays;

import java.util.Arrays;

public class LC1929 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2* nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[i+ nums.length]=nums[i];
        }
        return ans;
    }
}
class Main{
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,3,5,3};
        LC1929 lc1929 = new LC1929();
        int[] concatenatedArray = lc1929.getConcatenation(nums);
        System.out.println("concatenatedArray = " + Arrays.toString(concatenatedArray));

    }
}
