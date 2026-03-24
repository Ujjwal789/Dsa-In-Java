import java.util.ArrayList;
import java.util.Arrays;

public class Leader {
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};


        // Get leaders using class method
        ArrayList<Integer> ans = leaders(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean leader = true;

            for (int j = i+1; j <n ; j++) {
                if (nums[j] >= nums [i]){
                    leader =false;
                    break;
                }

            }
            if (leader) {
                ans.add(nums[i]);
            }
        }
        return ans;

    }

}

