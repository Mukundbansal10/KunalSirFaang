package src.Arrays;

public class LC1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        evenDigits(nums);
    }
    static void evenDigits(int[] nums){
        int count =0;
        for(int i=0;i<nums.length;i++){
            String str = Integer.toString(nums[i]);
            if (str.length()%2==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
