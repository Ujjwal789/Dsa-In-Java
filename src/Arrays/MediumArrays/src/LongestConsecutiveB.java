import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestConsecutiveB{

    public static void main(String[] args) {
        // Input array of integers
        int[] nums = {100, 4, 200, 1, 3, 2};
        // Call the function and store the result
        int ans = longestConsecutive(nums);
        // Output the result
        System.out.println("The longest consecutive sequence is " + ans);
    }
    public static int longestConsecutive(int[] nums ){
        int n = nums.length;
        int lastsmall =Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;
        if (n == 0){
            return 0;
        }
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == lastsmall){
                count += 1;
                lastsmall = nums[i];
            }else  if (nums[i]  != lastsmall){
                count = 1;
                lastsmall = nums[i];
            }

            longest = Math.max(longest, count);
        }
        return longest;
    }
}
