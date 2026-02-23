import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionBrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n1 = sc.nextInt();
        System.out.println("nums 1");
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }System.out.println("size of array");
        int n2 = sc.nextInt();
        System.out.println("nums 2");
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] union = UnionSortedArray.Solution.unionArray(nums1, nums2);
        System.out.println("Union array:");
        for (int num : union) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    class Solution {
        public int[] unionArray(int[] nums1, int[] nums2) {
            int  n1 = nums1.length;
            int  n2 = nums2.length;

            Set<Integer> st = new HashSet<>();

            // Insert elements from first array
            for (int num : nums1) {
                st.add(num);
            }

            // Insert elements from second array
            for (int num : nums2) {
                st.add(num);
            }

            int [] result = new int[st.size()];
            int index = 0;
            for(int num: st ){
                result[index++] = num;
            }

            return result;


        }
    }
}
