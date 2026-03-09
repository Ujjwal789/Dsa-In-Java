import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntersectionBrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array1");
        int n1 = sc.nextInt();
        System.out.println("nums 1");
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }System.out.println("size of array2");
        int n2 = sc.nextInt();
        System.out.println("nums 2");
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        // Call method correctly and convert to int[]
        List<Integer> list = Solution.inseration(nums1, nums2, n1, n2);
        int[] intersection = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intersection[i] = list.get(i);
        }

        System.out.println("Intersection array:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        sc.close();
    }

     static class Solution{
        public static List<Integer> inseration(int[] nums1, int[] nums2, int n, int m){
            List<Integer> ans = new ArrayList<>(); //initalaise ans
            int[] visted = new int[m];  // visted array length
            for (int i = 0; i < n; i++) {  //itarte in array
                for (int j = 0; j < m; j++) {
                    if(nums1[i] == nums2[j] && visted[j]==0){ //logic not visted and same element
                        ans.add(nums1[i]);
                        visted[j] = 1;
                        break;
                    }
                    if(nums2[j]>nums1[i]) break;
                }
            }
            return ans;

        }
    }
}
