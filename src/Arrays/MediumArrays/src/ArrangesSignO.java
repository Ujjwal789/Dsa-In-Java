import java.util.Arrays;
import java.util.Scanner;

public class ArrangesSignO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums ={7, -8, -8, 1, -5, 7, -2, 7, 7};

        int[] result = ArrangeSO(nums);

        System.out.println(Arrays.toString(result));
    }
    public static int[] ArrangeSO(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        int posindex = 0;
        int negindex = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i]>0){
                ans[posindex] =nums[i];
                posindex += 2;
            }else {
                ans[negindex] =nums[i];
                negindex += 2;

            }
        }
        return ans;
    }
}

