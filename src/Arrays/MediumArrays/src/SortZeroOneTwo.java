import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0 };
         sortZOT(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void sortZOT(int[] nums) {
        int n = nums.length;
        int cnt0 = 0, cnt1=0, cnt2 =0;

        for(int num : nums){
            if(num == 0)cnt0++;
            if(num == 1)cnt1++;
            else cnt2++;
        }

        for(int i =0; i<cnt0; i++){
            nums[i] =0;
        } for(int i =cnt0; i<cnt0+cnt1; i++){
            nums[i] =1;
        } for(int i =cnt0+cnt1; i<n; i++){
            nums[i] =2;
        }

        return;

    }
}
