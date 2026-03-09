import java.util.ArrayList;
import java.util.List;

public class BruteMajorityII {
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};

     List<Integer> ans = majorityElementTwo(arr);
        System.out.println("the majorirty element are");
        for (int it : ans){
            System.out.println(it + " ");
        }
        System.out.println();

    }
    public static List<Integer> majorityElementTwo(int[] nums) {
        List<Integer> result  = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i<n; i++){

            int count =0;
            // Skip if already checked/added
            if (result.contains(nums[i])) {
                continue;
            }

            for(int j =0; j<n; j++){
                if (nums[j] ==  nums[i]){
                    count++;
                }

            }

            if(count > n/3){
                result.add(nums[i]);
            }
            if(result.size() == 2){
                break;
            }
        }

        return result;
    }
}
