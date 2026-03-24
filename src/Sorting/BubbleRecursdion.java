import java.util.Scanner;

public class BubbleRecursdion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        int n = sc.nextInt();

        System.out.println("enter arrya");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
             arr [i] = sc.nextInt();
        }

        Bubble_Rec(arr, n);  // call function
        System.out.println("Recursion sorted array");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }

    }

     static void Bubble_Rec(int [] arr, int n){

        if (n == 1){
            return;
        }

             for (int j = 0; j <n-1; j++) {
                 if( arr[j]>arr[j+1]){
                     int temp = arr[j+1];
                     arr[j+1] = arr[j];
                     arr[j] = temp;

                 }
             }

             Bubble_Rec(arr, n-1);


     }
}
