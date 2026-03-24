import java.util.Scanner;

public class Kadenalgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums ={7, -8, -8, 1, -5, 7, -2, 7, 7};
        System.out.println(maxSubArrayK(nums));
    }
    public static int maxSubArrayK(int[] nums) {
        int n = nums.length;
        int maxi =Integer.MIN_VALUE;
        int sum =0;

        int start = 0;      // temporary start
        int ansStart = 0;   // final start
        int ansEnd = 0;     // final end


        for(int i =0; i<n; i++){
            if (sum ==0){
                start = i;
            }
            sum += nums[i];

            if(sum > maxi){
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum<0){
                sum =0;
            }
        }
        // Print subarray
        System.out.print("Maximum Subarray: ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nMaximum Sum: " + maxi);
        return maxi;

    }
}
