public class CountInversion {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 1, 3, 5};
        long result = numberOfInversions(nums);
        System.out.println(result);

    }
    public static long numberOfInversions(int[] nums) {
        int n = nums.length;
        int count =0;

        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i]> nums[j]){
                    count++;
                }
            }
        }

        return count;

    }
}
