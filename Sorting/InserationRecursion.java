import java.util.Scanner;

public class InserationRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("enter array");
        for (int i = 0; i < n; i++) {
             nums [i] = sc.nextInt();
        }

        Ins_rec(nums, n);

        System.out.println("Sorted array rec");
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void Ins_rec(int[] nums, int n){
    if( n<=1){
        return;
    }
        Ins_rec(nums, n-1);
        int last= nums[n-1];
        int j = n-2;

        while(j >=0 && nums[j]>last){
          nums[j+1] = nums[j];
          j--;
        }

        nums[j + 1] = last;



    }
}
