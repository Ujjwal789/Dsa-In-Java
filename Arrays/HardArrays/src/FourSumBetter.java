import java.util.*;
public class FourSumBetter {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> ans = fourSum(arr, target);
        for (List<Integer> quad : ans) {
            System.out.println(quad);
        }
    }
    public  static List<List<Integer>> fourSum(int[] nums, int target) {
        int n  = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                HashSet<Integer> seen = new HashSet<>();
                for(int k = j+1; k<n; k++){
                    long L = (long) target -nums[i] - nums[j] - nums[k];
                    if(seen.contains((int) L)) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int)L);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    seen.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(st);

    }
}
