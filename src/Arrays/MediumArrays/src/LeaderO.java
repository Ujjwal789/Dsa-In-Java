import java.util.ArrayList;
import java.util.Collections;

public class LeaderO {
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};


        // Get leaders using class method
        ArrayList<Integer> ans = leadersOp(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> leadersOp(int[] nums){
         ArrayList<Integer> ans = new ArrayList<>();
         int n = nums.length;
         if (n == 0){
             return ans;
         }

         int max = nums[n-1];
         ans.add(nums[n-1]);

        for (int i = n-2; i >=0 ; i--) {
          if (nums[i]>max){
              ans.add(nums[i]);
              max = nums[i];
          }
        }
        Collections.reverse(ans);
        return ans;
    }

}
