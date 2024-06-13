package src.Arrays;

import java.util.HashMap;

public class LC1512 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int count =0;
        HashMap<Integer,Integer>map = new HashMap<>();
//        if element is in the map then increase the count by 1 every time
        for (int num:arr) {
            if(map.containsKey(num)){
                count+= map.get(num);
        }
//            if value is not present then put the value in map
//            if num is already in map then num value + count of 1
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(count);
    }
}
