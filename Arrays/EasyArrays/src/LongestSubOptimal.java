public class LongestSubOptimal {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(SubOPtimal(nums, k));
    }
    public static int SubOPtimal(int[] nums, int k) {
        int n = nums.length;
        int maxlength = 0;
        int Sum = nums[0];
        int left = 0;
        int right = 0;
        while (right<n){
            while (left<= right && Sum > k){
                Sum -= nums[left];
                left++;
            }
            if (Sum ==k){
                maxlength = Math.max(maxlength, right-left+1);
            }
            right++;
            if (right<n){
                Sum += nums[right];
            }
        }

        return maxlength;

    }

}
