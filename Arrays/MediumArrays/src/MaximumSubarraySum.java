import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums ={7, -8, -8, 1, -5, 7, -2, 7, 7};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            int sum =0;
            for(int j =i; j<n; j++){
                sum += nums[j];
                maxi = Math.max(maxi, sum);
            }

        }
        return maxi;


    }
}
