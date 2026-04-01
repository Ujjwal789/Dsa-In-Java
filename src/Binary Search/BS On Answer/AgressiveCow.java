import java.util.Arrays;

public class AgressiveCow {
    public static void main(String[] args) {
        int [] nums = {4, 2, 1, 3, 6};
        int k = 2;
        int result = aggressiveCows(nums, k);
        System.out.println(result);
    }
    private static boolean possibleplace(int[] nums, int k, int d) {
        int count = 1;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] - last >= d) {

                count++;
                last = nums[i];
            }
            if (count >= k) return true;
        }
        // Not possible to place all cows
        return false;
    }

    public static int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int low = 1;
        int high = nums[n-1] -nums[0];
        int ans = 0;

        while(low<=high){
            int mid = (low+high)/2;
            if (possibleplace(nums, k, mid)) {
                ans = mid;        // store answer
                low = mid + 1;    // try bigger distance
            } else {
                high = mid - 1;   // reduce distance
            }
        }

        return ans;
    }
}
