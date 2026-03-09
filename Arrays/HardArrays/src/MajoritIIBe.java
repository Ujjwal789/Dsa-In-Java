import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajoritIIBe {
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};

        List<Integer> ans = majorityElementBe(arr);
        System.out.println("the majorirty element are");
        for (int it : ans){
            System.out.println(it + " ");
        }
        System.out.println();

    } public static List<Integer> majorityElementBe(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mpp =new HashMap<>();
        int mini = n /3+ 1;

        for(int i =0; i<n; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
            if(mpp.get(nums[i]) == mini){
                result.add(nums[i]);
            }
            if(result.size() == 2)break;
        }
        return result;


    }
}
