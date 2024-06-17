package src.Arrays;

public class LC1773 {

    public static int countMatches(String[][] arr, String ruleKey, String ruleValue) {
        int keyIndex;
        switch (ruleKey) {
            case "type":
                keyIndex = 0;
                break;
            case "color":
                keyIndex = 1;
                break;
            case "name":
                keyIndex = 2;
                break;
            default:
                return 0;
        }

        int count = 0;
        for (String[] item : arr) {
            if (item[keyIndex].equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[][] arr = {
                {"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "blue", "iphone"}
        };

        String ruleKey = "color", ruleValue = "blue";
        int count = countMatches(arr, ruleKey, ruleValue);
        System.out.println("count = " + count); // Output should be 1
    }
}
