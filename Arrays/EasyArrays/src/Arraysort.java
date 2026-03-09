import java.util.Scanner;

public class Arraysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        System.out.println("Enter Array");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i-1]){

            }else {
                sorted = false;
                break;
            }

        } if (sorted) {
            System.out.println("Array is sorted .");
        } else {
            System.out.println("Array is NOT sorted.");
        }


    }

}
