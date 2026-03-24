import java.util.*;

public class ThreeSumB {

        public static void main(String[] args) {
            int[] arr = {-1, 0, 1, 2, -1, -4};
            int n = arr.length;
            List<List<Integer>> res = threeSum(arr);

            for (List<Integer> triplet : res) {
                for (int num : triplet) System.out.print(num + " ");
                System.out.println();
            }
        }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n  = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){

                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }

        }
        return new ArrayList<>(st);

    }
}
