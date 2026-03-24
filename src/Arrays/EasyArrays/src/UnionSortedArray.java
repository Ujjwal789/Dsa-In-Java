import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionSortedArray {
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
        int[] union = Solution.unionArray(nums1, nums2);
        System.out.println("Union array:");
        for (int num : union) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    static class Solution {
        public static int[] unionArray(int[] nums1, int[] nums2) {
            int  n1 = nums1.length;
            int  n2 = nums2.length;
            int i = 0; //pointer 1
            int j = 0; //pointer 2
            List<Integer> Union = new ArrayList<>(); // return type initalisation

            while(i<n1 && j<n2){ //for check smaller and use set to store unique
                if (nums1[i] < nums2[j]){
                    if(Union.isEmpty() || Union.get(Union.size()-1) != nums1[i])
                        Union.add(nums1[i]);
                    i++;
                }else if (nums2[j] < nums1[i]){
                    if(Union.isEmpty() || Union.get(Union.size()-1) != nums2[j])
                        Union.add(nums2[j]);
                    j++;
                }else {
                    if(Union.isEmpty() || Union.get(Union.size()-1) != nums1[i])
                        Union.add(nums1[i]);
                    i++; j++;
                }
            }
            // Append remaining elements from arr1 if arr1>arr2
            while (i < n1) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != nums1[i])
                    Union.add(nums1[i]);
                i++;
            }

            // Append remaining elements from arr2
            while (j < n2) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != nums2[j])
                    Union.add(nums2[j]);
                j++;

            }  // Convert List<Integer> to int[]
            int[] result = new int[Union.size()];
            for (int k = 0; k < Union.size(); k++) {
                result[k] = Union.get(k);
            }

            return result;
        }
    }
}
