import java.util.Scanner;

public class plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n  =sc.nextInt();
        Solution so = new Solution();
        so.plaindrome(n);



    }

}
 class Solution {
    public int plaindrome(int n) {
        int reverse = 0;
        int reversed = n;
        while (n != 0){
             int ld = n %10;
             reverse = reverse * 10 +ld;

             n = n /10;
        }
        if( reversed == reverse){
            System.out.println("is plaindrome");
        }else {
            System.out.println("not a plaindrome");
        }
        return reversed;
    }

}

