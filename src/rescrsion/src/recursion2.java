import java.util.Scanner;

 class recursion {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();

        Sum.PrintNumber(n);
    }
}

class  Sum{
    static void PrintNumber(int n ){
        if (n == 0){
            return;
        }

        System.out.println(n);
        PrintNumber(n - 1);




    }
}
