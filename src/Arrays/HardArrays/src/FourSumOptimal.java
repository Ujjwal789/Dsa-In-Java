import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> ans = fourSumOp(arr, target);
        for (List<Integer> quad : ans) {
            System.out.println(quad);
        }
    }
    public static List<List<Integer>> fourSumOp(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i  =0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            for(int j  =i+1; j<n; j++){
                if(j>i+1 && nums[j] == nums[j-1])continue;
                int k = j + 1;
                int l = n - 1;

                while(k<l){
                    long sum = (long) nums[i] +nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k],nums[l]));

                        while(k<l && nums[k] == nums[k+1]) k++;
                        while(k<l && nums[l] == nums[l-1]) l--;
                        k++;
                        l--;
                    }else if (sum<target)k++;
                    else l--;
                }
            }
        }
        return ans;
    }
}
