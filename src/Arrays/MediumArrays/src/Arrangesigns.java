import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arrangesigns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums ={7, -8, -8, 1, -5, 7, -2, 7, 7};

        int[] result = ArrangeS(nums);

        System.out.println(Arrays.toString(result));
    }
    public static int[] ArrangeS(int[] nums) {
        int n  = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg= new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        for(int i = 0; i<n/2; i++){
            nums[2*i] = pos.get(i);
            nums[2*i + 1] = neg.get(i);
        }

        return nums;

    }
}
