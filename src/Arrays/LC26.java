package src.Arrays;

public class LC26 {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }

    static void removeDuplicates(int[] nums) {

//        first approach


//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] != nums[i+1]) {
//                list.add(nums[i]);
//            }
//        }
//        list.add(nums[nums.length-1]);
//        Integer[] array = (Integer[]) list.toArray(new Integer[0]);
//
//        System.out.println(array.length);
//        System.out.println(Arrays.toString(array));


//        Second one approach

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(k);
    }
}
