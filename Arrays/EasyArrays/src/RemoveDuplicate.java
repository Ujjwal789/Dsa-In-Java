import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        System.out.println("Enter Array");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int newLength = Remove_Du(nums, n);
        System.out.println("New length: " + newLength);
        System.out.println("Array after removing duplicates:");
        for (int k = 0; k < newLength; k++) {
            System.out.print(nums[k] + " ");
        }
    }
    public static int Remove_Du(int[] nums, int n){
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}