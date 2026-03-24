public class SubArraySumK {
    public static void main(String[] args) {

        SubArraySumK obj = new SubArraySumK();

        int[] nums = {1, 1, 1};
        int k = 2;

        int result = obj.subarraySum(nums, k);

        System.out.println("Number of subarrays with sum " + k + " is: " + result);
    }

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for(int i  = 0; i<n; i++){
            int sum = 0;
            for(int j =i; j<n; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;

    }
}
