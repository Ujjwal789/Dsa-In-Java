import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Arrsy length");
        int n = sc.nextInt();

        int num[] = new int [n];
        System.out.println("enter array" +n);
        for (int i = 0; i<n; i++){
            num [i] =sc.nextInt();
        }
        Bubble_srt( num, n);

        System.out.println("Sorted array");
        for (int i =0; i<n; i++){
            System.out.println(num[i]);
        }
    }
    public static void  Bubble_srt(int num[], int n){
        for (int i =n-1; i>0; i--){
            for (int j =0; j<i; j++){
                if(num[j] >num[j+1]){
                    int temp = num[j+1];
                    num [j+1] = num[j];
                    num [j] = temp;
                }
            }

        }

    }
}
