import java.util.Scanner;

public class MajorityElementBrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums ={7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(BMajority(nums));
    }

    public static int BMajority(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count =0;
            for (int j = 0; j < n; j++) {
                if(nums[i] == nums [j]){
                    count++;
                }

            }
            if (count > n/2){
                return nums[i];
            }
        }

        return -1;
    }
}
