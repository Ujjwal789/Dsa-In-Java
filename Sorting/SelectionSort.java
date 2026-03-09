import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter array" + n );
        int arr[] =  new int [n];
        for (int i =0; i<n; i++){
            arr [i] = sc.nextInt();
        }
        selection_srt(arr, n);
        System.out.println("Array after sorting");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
        sc.close();


    }
    public static void selection_srt(int [] arr, int n){
        for (int i =0; i< arr.length-1; i++){
            int min = i;
            for (int j = i +1; j< arr.length; j++){
                if (arr[j] <arr[min]){
                    min =j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }


    }
}
