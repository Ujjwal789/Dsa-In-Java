import java.util.Arrays;
import java.util.Scanner;

public class RotatebyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        System.out.println("Enter Array");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        rotateArray(nums, k);

        System.out.println("Array after rotation:");
        System.out.println(Arrays.toString(nums));
    }
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n ;
        int[] temp = new int[k];

        for(int i = 0; i<k; i++){
            temp [i] =nums[i];  //Store first k elements
        }
        for(int i = k; i<n; i++){
            nums[i-k] =nums[i]; //Shift remaining elements left
        }
        for(int i = n-k; i<n; i++){
            nums[i] =temp[i-(n-k)]; //Copy temp to end
        }

    }
}
