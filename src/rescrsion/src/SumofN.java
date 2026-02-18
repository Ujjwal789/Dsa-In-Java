import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();

        int result = Solution.sumofhelper(n);
        System.out.println("Sum = " + result);

    }
}
class Solution{
    static int sumofhelper(int i){
        if (i==0){

            return 0;
        }
        return i + sumofhelper(i-1);


    }

}


