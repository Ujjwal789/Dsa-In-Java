public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            int product = 1;
            for(int j = i; j<n; j++){
              product = product*nums[j];
                 max = Math.max(max, product);
            }
        }
        return max;
    }
}
