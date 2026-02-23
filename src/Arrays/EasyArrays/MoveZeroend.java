import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        System.out.println("Enter Array");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
        System.out.println("Array after moves 0");
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length] ;
        int n = nums.length;
        int j = -1;
        for(int i =0; i<n; i++){
            if(nums[i] ==0){
                j = i;
                break;
            }
        }

        if(j == -1){
            return;
        }

        for(int i =j+1; i<n; i++){
            if(nums[i] !=0){
                int temps = nums[i];
                nums[i] = nums[j];
                nums[j] = temps;
                j++;
            }
        }


    }
}
