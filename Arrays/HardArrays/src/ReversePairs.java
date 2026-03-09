public class ReversePairs {
    public static void main(String[] args) {
        int[] nums = {6, 4, 1, 2, 7};
         int result = reversePairs(nums);
        System.out.println("reverse pair is " + result);
    }
    public static int reversePairs(int[] nums) {
        int n = nums.length;
        int count =0;

        for(int i =0; i<n-1; i++){
            for(int j =i+1; j<n-1; j++){
                if(nums[i]>2*nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
