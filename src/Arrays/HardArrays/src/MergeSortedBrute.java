import java.util.Arrays;

public class MergeSortedBrute {
    public static void main(String[] args) {
        long[] arr1 = {1,3,5,7};
        long[] arr2 = {2,4,6,8};

        int n = arr1.length;
        int m = arr2.length;

        Merge(arr1, arr2, n, m);

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
    public static void Merge(long[] arr1,long[] arr2, int n, int m){
        long[] arr3 = new long[n+m];
        int left = 0;
        int right =0;
        int index =0;

        while(left < n && right < m){
            if (arr1[left] <= arr2[right]){
                arr3[index] = arr1[left];
                left++; index++;
            }else {
                arr3[index] = arr2[right];
                right++; index++;
            }

        }
        while(left < n){
            arr3[index++] = arr1[left++];
        }

        while(right < m){
            arr3[index++] = arr2[right++];
        }

        for (int i = 0; i < n+m; i++) {
            if (i<n) arr1[i] = arr3[i];
            else arr2[i-n] = arr3[i];
        }
    }
}
