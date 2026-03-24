import java.util.Scanner;
import java.util.*;


public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();

        int[] nums  = new int[n];
        System.out.println("enter array");
        for (int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        merge_sort(nums, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);

        }
    }
    public static void merge_sort(int[] nums, int low, int high) {
        if (low >=high) return;
        int mid = (low + high) /2;
        merge_sort(nums, low, mid);
        merge_sort(nums, mid+1, high);
        merge(nums, low, mid, high);


    }
    public static void merge(int[] nums, int low, int mid, int high ){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left<=mid &&right<=high){
            if (nums[left] <= nums[right]){
                temp.add(nums[left++]);}
            else{
                    temp.add(nums[right++]);
                }
            }

        while (left <= mid)
            temp.add(nums[left++]);
         while (right <= high)
            temp.add(nums[right++]);
         for (int i = low; i <= high; i++)
               nums[i] = temp.get(i - low);

    }


    }

