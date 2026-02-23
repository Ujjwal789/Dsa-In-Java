import java.util.Scanner;

public class SsmallandSlarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        System.out.println("Enter Array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int Slargest = find2ndlarge(arr, n);
        System.out.println("SLargest element is: " + Slargest);

        int Smallest = find2ndSmall(arr, n);
        System.out.println("SLargest element is: " + Smallest);

    }
    public  static int find2ndlarge(int[] arr, int n) {
        int large =  arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > large) {
                secondLargest = large;
                large = arr[i];   // Update largest
            } else if (arr[i] > secondLargest && arr[i] < large) {
                secondLargest = arr[i];

            }
        }
        return secondLargest;

    }
    public  static int find2ndSmall(int[] arr, int n) {
        int small = arr[0];
        int SecondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]<small){
                SecondSmallest = small;
                small = arr[i];
            } else if (arr[i]<SecondSmallest && arr[i] >small) {
                SecondSmallest = arr[i];

            }

        }
        return SecondSmallest;
    }


}
