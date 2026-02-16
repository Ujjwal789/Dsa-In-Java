import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();

        Solution.PrintNumber(n);
    }
}

class  Solution {
    static void PrintNumber(int n ){
        if (n == 0){
            return;
        }

        System.out.println(n);
        PrintNumber(n - 1);




    }
}
