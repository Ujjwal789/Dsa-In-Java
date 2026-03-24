import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {
        class Solution {
            public void rotateArrayByOne(int[] nums) {
                int n = nums.length;
                int temp = nums[0];
                for(int i = 1; i<n; i++){
                    nums[i - 1] = nums[i];
                }

                nums[n -1] = temp;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter array size");
            int n = sc.nextInt();

            System.out.println("Enter Array");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            LeftRotate lr = new LeftRotate();
            Solution sol = lr.new Solution();  // inner class instance
            sol.rotateArrayByOne(nums);
            System.out.println(Arrays.toString(nums));  // [2, 3, 4, 5, 1]
        }
    }

