import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestConseccutive {

    public static void main(String[] args) {
        // Input array of integers
        int[] nums = {100, 4, 200, 1, 3, 2};
        // Call the function and store the result
        int ans = longestConsecutive(nums);
        // Output the result
        System.out.println("The longest consecutive sequence is " + ans);
    }

    private static boolean linearSearch(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int n = nums.length;
        int longest = 1;

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int cnt = 1;

            while (linearSearch(nums, x + 1)) {
                x += 1;
                cnt += 1;
            }

            longest = Math.max(longest, cnt);
        }

        return longest;
    }
}
