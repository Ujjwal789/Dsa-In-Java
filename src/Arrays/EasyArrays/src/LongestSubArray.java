import java.util.HashMap;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(Sub(nums, k));
    }

    public static int Sub(int[] nums, int k) { //Better Approach
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int maxlength = 0;
        int Sum = 0;

        for (int i = 0; i < n; i++) {
            Sum += nums[i];
            if (Sum == k) {
                maxlength = i + 1;
            }

            if (map.containsKey(Sum - k)) {
                int length = i - map.get(Sum - k);
                if (map.containsKey(Sum - k)) {
                    length = i - map.get(Sum - k);
                    if (length > maxlength) {
                        maxlength = length;
                    }
                }
            }
                if (!map.containsKey(Sum)) {
                    map.put(Sum, i);
                }
            }


            return maxlength;
        }
    }