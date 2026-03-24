import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        quickSort(nums, 0, n - 1);

        System.out.println("Quick sort array is");
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);

            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);
        }
    }
    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];   // last element as pivot
        int i = low - 1;
        int j = low;

        while (j < high) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }
}


