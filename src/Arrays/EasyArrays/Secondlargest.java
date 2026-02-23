import java.util.Scanner;

public class Secondlargest {
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

    }
    public static int find2ndlarge(int[] arr, int n) {
        int large =  arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > large) {
                large = arr[i];   // Update largest
            }
        }
        int secondLargest = Integer.MIN_VALUE; // bruteforce approch after large element
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] < large) { // if arr[i slargest s bada and largest s chota h
                secondLargest = arr[i];
            }
        }

        return secondLargest;



    }

}
