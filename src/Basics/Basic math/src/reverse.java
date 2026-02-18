import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int reverse = 0;

        while (x >0){
            int ld = x %10 ;
            reverse = reverse*10 +ld;
             x = x /10;
        }
        System.out.println(reverse);
    }

}
