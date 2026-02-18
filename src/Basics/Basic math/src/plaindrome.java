import java.util.Scanner;

public class plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n  =sc.nextInt();

        Solution so = new Solution();
        int reversed = so.plaindrome(n);
        System.out.println(reversed);
        if ( n == reversed){
            System.out.println("is plaindrome");
        }else {
            System.out.println("not a plaindrome");
        }

    }

}
 class Solution {
    public int plaindrome(int n) {
        int reverse = 0;
        while (n != 0){
             int ld = n %10;
             reverse = reverse * 10 +ld;

             n = n /10;
        }
        return reverse;

    }

}

