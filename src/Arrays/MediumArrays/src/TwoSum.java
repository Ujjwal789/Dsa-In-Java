import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums ={1, 3, 5, -7, 6, -3};
        int k = 0;
//        int[] result = twoSum(nums,k);
        System.out.println(twoSum(nums, k)); //Arrays.tostring(result)
    }
    public static boolean twoSum(int[] nums, int k){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i]+ nums[j] == k){
                    return true;
                    // return new int[]{i, j};
                }

            }
        }
        return false;  //return new int []{};
    }
}
