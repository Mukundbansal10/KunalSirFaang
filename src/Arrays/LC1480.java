package src.Arrays;

import java.util.Arrays;

public class LC1480 {
    public int[] runningSum(int[] nums) {
        int prev =0;
        int[] runningSum = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            runningSum[i] = nums[i] + prev;
            prev = runningSum[i];
        }
        return runningSum;
    }
}
class Main1{
    public static void main(String[] args) {
        int[] nums = new int[]{2,4,3,5,7};
        LC1480 lc1480 = new LC1480();
        int[] runningSum = lc1480.runningSum(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(runningSum));
    }
}