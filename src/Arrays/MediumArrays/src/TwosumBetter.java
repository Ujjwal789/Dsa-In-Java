import java.util.Arrays;
import java.util.HashMap;

public class TwosumBetter {
    public static void main(String[] args) {
        int[] nums ={1, 3, 5, -7, 6, -3};
        int k = 0;
        int[] result = twoSumBe(nums,k);
        System.out.println(Arrays.toString(result)); //Arrays.tostring(result)
    }
    public static int[] twoSumBe(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int sum =k-num; //formula
            if (map.containsKey(sum)){
                int index =map.get(sum);
                return new int[]{index,i};
        }
            map.put(num, i);
    }
        return new int[]{};
    }
}
