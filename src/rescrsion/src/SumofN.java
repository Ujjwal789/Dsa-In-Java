package rescrsion.src;

import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();

        int result = sumofhelper(n);
        System.out.println("Sum = " + result);

    }

    public static int sumofhelper(int i) {
        if (i == 0) {

            return 0;
        }
        return i + sumofhelper(i - 1);


    }
}

