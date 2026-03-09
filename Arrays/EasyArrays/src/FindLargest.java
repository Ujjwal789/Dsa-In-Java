import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        System.out.println("Enter Array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = findlarge(arr, n);
        System.out.println("Largest element is: " + largest);
    }
    public static int findlarge(int[] arr, int n){
        int large =  arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > large) {
                large = arr[i];   // Update largest
            }
        }
        return large;
    }
}
