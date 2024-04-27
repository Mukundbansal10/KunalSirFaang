package src.Searching;

public class LC374 extends GuessGame {
    public static void main(String[] args) {
        LC374 solution = new LC374();
        System.out.println(solution.guess(100)); // Example usage of guessNumber method
    }
}

class GuessGame {
    // This method is provided by the problem statement
    public int guess(int num) {
        // This method is given by the problem. It simulates guessing.
        // For the purpose of this example, let's assume there is an external API
        // called guess(int num) that returns -1 if the number is lower than the guessed number,
        // 1 if the number is higher, and 0 if it's equal.
        return 0; // This is a placeholder, the actual implementation should be provided by the problem statement.
    }
}

class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        while (low <= n) {
            int mid = low + (n - low) / 2;
            int guessResult = guess(mid);
            if (guessResult == 0) {
                return mid;
            } else if (guessResult == 1) {
                low = mid + 1;
            } else {
                n = mid - 1;
            }
        }
        return -1; // Number not found, this should not happen in this problem
    }
}
