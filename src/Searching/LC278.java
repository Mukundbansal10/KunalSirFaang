package src.Searching;

public class LC278 {
    public static void main(String[] args) {


        int n = 10;
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            } else low = mid + 1;
        }
        System.out.println(low);
    }

    static boolean isBadVersion(int mid) {
        return true;
    }
}
