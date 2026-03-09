import java.util.Arrays;
public class MergeSortedOP {public static void main(String[] args) {
    int[] arr1 = {1,3,5,7};
    int[] arr2 = {2,4,6,8};

    int n = arr1.length;
    int m = arr2.length;

    MergeSo(arr1, arr2, n, m);

    System.out.println("Array 1: " + Arrays.toString(arr1));
    System.out.println("Array 2: " + Arrays.toString(arr2));
}
public static void MergeSo(int[] arr1, int[] arr2, int n, int m){
    int left = n-1;
    int right = 0;
    while (left >= 0 && right < m ){
        if(arr1[left] > arr2[right]){
            int temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
            left--; right++;
        }else {
            break;
        }
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
}

}
