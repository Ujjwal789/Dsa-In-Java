import java.util.*;

public class ThreeSumBetter {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> res = threeSumBetter(arr);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSumBetter(int[] nums) {
        int n  = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for(int i = 0; i<n; i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j = i+1; j<n; j++){
                int third = -(nums[i]+ nums[j]);

                if(hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);

    }
}
