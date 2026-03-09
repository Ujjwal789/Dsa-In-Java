import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntersectionOptimal {
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
        List<Integer> list = inseration(nums1, nums2, n1, n2);
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
    public static List<Integer> inseration(int[] nums1, int[] nums2, int n, int m){
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i<n && j<m){
            if (nums1[i]<nums2[j]) {
                i++;
            }else if (nums2[j]<nums1[i]) {
                j++;
            }else {
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        return ans;

    }

}
