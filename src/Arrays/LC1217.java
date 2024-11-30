package src.Arrays;

public class LC1217 {
    public static void main(String[] args) {


        int[] position = {1, 2, 3};
        int even = 0, odd = 0;
        for (int i : position) {
            if (i % 2 == 0) even++;
            else odd++;
        }
        if (even == position.length || odd == position.length) System.out.println(0); //need to understand this line again
        else System.out.println("Math.min(even, odd) = " + Math.min(even, odd));
    }
}
