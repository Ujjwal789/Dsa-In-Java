import java.util.Arrays;

public class BookAllocation {
    public static void main(String[] args) {
        int [] nums = {12, 34, 67, 90};
        int m = 2;
        int result = findPages(nums, m);
        System.out.println(result);
    }

        public static boolean ispossible(int[] nums, int m, int maxpages){
            int n = nums.length;
            int student = 1;
            long pages = 0;

            for(int i =0; i<n; i++){
                if(nums[i]>maxpages)return false;
                if(pages + nums[i]>maxpages){
                    student += 1;
                    pages += nums[i];

                }else{
                    pages += nums[i];
                }if(student > m){
                    return false;
                }
            }

            return true;
        }

    public static int findPages(int[] nums, int m) {
            int low = Arrays.stream(nums).max().getAsInt();
            int high = Arrays.stream(nums).sum();
            int result = -1;

            while(low<=high){
                int  mid = (low + high)/2;

                if (ispossible(nums, m, mid)) {
                    result = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return result;
        }
}

